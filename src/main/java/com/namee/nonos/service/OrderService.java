package com.namee.nonos.service;

import java.util.List;
import java.util.Map;

import com.namee.nonos.domain.Order;

public interface OrderService {
	public List<Map<String, Object>> getOrderList();
	public Order getOrder(int orderId);
	public int writeOrder(Order order);
	public int modifyOrder(Order order);
	public int deleteOrder(int orderId);
}
