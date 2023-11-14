package com.smhrd.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class MemberDAO {
	
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	public int Join(Member m) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		int cnt = sqlSession.insert("Join", m);
		
		sqlSession.close();
		
		return cnt;
	}
	
//	public List Login(Member m) {
//		
//		SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
//		
//		SqlSession sqlSession = sqlSessionFactory.openSession(true);
//		
//		List<Member> list = new ArrayList<Member>();
//		
//		list = sqlSession.selectList("Login", m);
//		
//		return list;
//	}
	
	public Member Login(Member m) {
	
		SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		Member info = sqlSession.selectOne("Login", m);
		
		return info;
	}
	
}
