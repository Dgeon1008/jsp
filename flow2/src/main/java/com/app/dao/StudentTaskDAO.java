package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.dto.StudentTaskDTO;
import com.app.mybatis.config.MyBatisConfig;

public class StudentTaskDAO {
	public SqlSession sqlSession;
	
	public StudentTaskDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(StudentTaskDTO studentTaskDTO) {
		sqlSession.insert("StudentTask.insert", studentTaskDTO);
	}
	
	
	
}
