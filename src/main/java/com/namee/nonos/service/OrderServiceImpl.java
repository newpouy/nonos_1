package com.namee.nonos.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namee.nonos.dao.OrderDao;
import com.namee.nonos.domain.Order;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderDao orderDao;
	Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	public List<Map<String, Object>> getOrderList() {
		logger.debug("getOrderList");
		// TODO Auto-generated method stub
		return orderDao.selectOrderList();
	}

	public Order getOrder(int orderId) {
		// TODO Auto-generated method stub
		return orderDao.selectOrder(orderId);
	}

	public int writeOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.insertOrder(order);
	}

	public int modifyOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.updateOrder(order);
	}

	@Override
	public int deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		return orderDao.deleteOrder(orderId);
	}

}
