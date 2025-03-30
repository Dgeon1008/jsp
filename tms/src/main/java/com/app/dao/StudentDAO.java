package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.dto.StudentDTO;
import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.StudentVO;

public class StudentDAO {
	public SqlSession sqlSession;
	
	public StudentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	학생입력
	public void insert(StudentVO studentVO) {
		sqlSession.insert("student.insert", studentVO);
	}
	
//	학생 전체 조회
	public List<StudentDTO> selectAll() {
		return sqlSession.selectList("student.selectAll");
	}
	
//	학생 한명 조회
	public Optional<StudentDTO> select(Long id) {
		return Optional.ofNullable(sqlSession.selectOne("student.select", id));
	}
	
//	학생 정보 업데이트
	public void update(StudentVO studentVO) {
		sqlSession.update("student.update", studentVO);
	}
	
//	학생 정보 삭제
	public void delete(Long id) {
		sqlSession.delete("student.delete", id);
	}
	
}





