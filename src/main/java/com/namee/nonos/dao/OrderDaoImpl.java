package com.namee.nonos.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.namee.nonos.domain.Order;

@Repository
public class OrderDaoImpl implements OrderDao {
	
	private Logger logger = LoggerFactory.getLogger(OrderDaoImpl.class);
	private SqlSession sqlSession;
	
	public void seSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public List<Map<String, Object>> selectOrderList() {
		logger.debug("selectOrderList");
		return sqlSession.selectList("selectOrderList");
	}

	public Order selectOrder(int orderId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("selectOrder", orderId);
	}

	public int insertOrder(Order order) {
		// TODO Auto-generated method stub
		return sqlSession.insert("insertOrder", order);
	}

	public int updateOrder(Order order) {
		// TODO Auto-generated method stub
		return sqlSession.update("updateOrder", order);
	}

	public int deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		return sqlSession.update("deleteOrder", orderId);
	}

}
