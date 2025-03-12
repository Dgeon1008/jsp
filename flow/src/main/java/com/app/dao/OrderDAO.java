package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.dto.OrderDTO;
import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.MemberVO;
import com.app.vo.OrderVO;
import com.app.vo.ProductVO;

public class OrderDAO {
	public SqlSession sqlSession;
	
	public OrderDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

//	주문 완료
	public void insert(OrderVO orderVO) {
		sqlSession.insert("order.insert", orderVO);
	}
	
//	주문 전체 조회
	public List<OrderDTO> selectAll(Long id) {
		return sqlSession.selectList("order.selectAll", id);
	}
	
	public int selectCountById(Long id) {
		return sqlSession.selectOne("order.selectCountById", id);
	}
	
	public void delete(Long id) {
		sqlSession.delete("order.delete",id);
	}
	
}



















