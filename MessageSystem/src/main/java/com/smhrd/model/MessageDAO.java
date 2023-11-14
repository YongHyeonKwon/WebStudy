package com.smhrd.model;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class MessageDAO {
	
	
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	// 메세지 보내기
	public int insertMsg(Message msg) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		int cnt = sqlSession.insert("insertMsg", msg);
	
		sqlSession.close();
		
		return cnt;
	}
	
	ArrayList<Message> list = new ArrayList<Message>();
	
	public ArrayList showMessage(String email) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		list = (ArrayList) sqlSession.selectList("selectAll", email);
		return list;
	}
	
	// 메세지 삭제하기
	public int deleteAll(String email) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		int cnt = sqlSession.delete("deleteAll", email);
		
		sqlSession.close();
		
		return cnt;
	}
	
	public int deleteOne(int num) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		int cnt = sqlSession.delete("deleteOne", num);
		
		sqlSession.close();
		
		return cnt;
	}
}
