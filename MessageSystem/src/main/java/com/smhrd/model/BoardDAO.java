package com.smhrd.model;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class BoardDAO {
	
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	// 게시판 글쓰기 기능
	public int write(Board b) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		int cnt = sqlSession.insert("insertBoard", b);
		
		sqlSession.close();
		
		return cnt;
	}
	
	ArrayList<Board> list = new ArrayList<Board>();
			
	public ArrayList showBoard() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		list = (ArrayList) sqlSession.selectList("list");
		
		sqlSession.close();
		
		return list;
	}
	
	public Board showDetail(int num) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		Board b = sqlSession.selectOne("Detail", num);
		
		sqlSession.close();
		
		return b;
	}
	
}
