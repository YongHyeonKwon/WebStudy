package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class MemberDAO {
	
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getsqlSession();
	
	public int Join(Member m) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		int cnt = sqlSession.insert("join", m);
		
		sqlSession.close();
		
		return cnt;
	}
	
	public String Login(Member m) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
//		sqlSession.selectOne(null); -> 실행 결과가 하나만 확인되는 경우
//		sqlSession.selectList(null); -> 실행 결과가 여러 개 확인되는 경우
		
		String name = sqlSession.selectOne("login", m); 

		return name;
	}
	
}
