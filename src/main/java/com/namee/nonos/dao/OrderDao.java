package com.namee.nonos.dao;

import java.util.List;
import java.util.Map;

import com.namee.nonos.domain.Order;


public interface OrderDao {
	public  List<Map<String, Object>> selectOrderList();
	public Order selectOrder(int orderId);
	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public Order deleteOrder(int order);
}
