package com.smhrd.database;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.dto.MemberDTO;

public class MemberDAO {
	
	// 1. 쿼리문을 전송할 수 있게끔 도와주는 도구를 가져오기
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
   //  2. 회원가입을 할 수 있는 insert 메소드 생성
	public void join(MemberDTO dto) {
		
		// 1) sqlsession 열어주기
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		// 2) sql구문 실행하기
		sqlSession.insert("com.smhrd.database.MemberDAO.join", dto);
		// 3) sqlsession 자원반납
		sqlSession.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
