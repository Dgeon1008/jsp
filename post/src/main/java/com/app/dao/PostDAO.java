package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.PostVO;

public class PostDAO {
	public SqlSession sqlSession;
	
	public PostDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
//	게시판 추가
	public void insert(PostVO postVO) {
		sqlSession.insert("post.insert", postVO);      
	}
	
//	게시판 전체 조회
	public List<PostVO> selectAll() {
		return sqlSession.selectList("post.selectAll");
	}
	
	
//	read 단일 조회
	public Optional<PostVO> select(Long id) {
//		단일 객체는 Optional로 감싸서 보낸다.
		return Optional.ofNullable(sqlSession.selectOne("post.select", id));
	}
	
//	최신 상품 아이디 조회
	public Long selectId() {
		return sqlSession.selectOne("post.selectId");
	}
	
//	게시판 수정
	public void update(PostVO postVO) {
		sqlSession.update("post.update", postVO);
	}
	
//	게시판 삭제
	public void delete(Long id) {
		sqlSession.delete("post.delete", id);
	}
	

	
}
