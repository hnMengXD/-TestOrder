package com.meng.service;

import java.util.List;

import com.meng.model.Address;
import com.meng.model.Food;
import com.meng.model.Order;
import com.meng.model.Time;
import com.meng.util.PageUtil;

public interface OrderService {

	List<Time> getTimeList();

	List<Address> getAddressList();

	List<Food> getFoodList();

	void addOneOrder(Order order);

	void addOrderFood(Order order, int[] fid);

	int getMaxOid();

	int getOrderCount();

	List<Order> getOrderList(PageUtil pageUtil);

}
