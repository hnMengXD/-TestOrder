package com.meng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meng.dao.OrderDAO;
import com.meng.model.Address;
import com.meng.model.Food;
import com.meng.model.Order;
import com.meng.model.Time;
import com.meng.util.PageUtil;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO orderDAO;

	@Override
	public List<Time> getTimeList() {
		// TODO Auto-generated method stub
		return orderDAO.getTimeList();
	}

	@Override
	public List<Address> getAddressList() {
		// TODO Auto-generated method stub
		return orderDAO.getAddressList();
	}

	@Override
	public List<Food> getFoodList() {
		// TODO Auto-generated method stub
		return orderDAO.getFoodList();
	}

	@Override
	public void addOneOrder(Order order) {
		orderDAO.addOneOrder(order);
	}

	@Override
	public void addOrderFood(Order order, int[] fid) {
		for (int i = 0; i < fid.length; i++) {
			
			orderDAO.addOrderFood(order,fid[i]);
		}
	}
	
	@Override
	public int getMaxOid() {
		// TODO Auto-generated method stub
		return orderDAO.getMaxOid();
	}

	@Override
	public List<Order> getOrderList(PageUtil pageUtil) {
		// TODO Auto-generated method stub
		return orderDAO.getOrderList(pageUtil);
	}
	
	@Override
	public int getOrderCount() {
		// TODO Auto-generated method stub
		return orderDAO.getOrderCount();
	}
}
