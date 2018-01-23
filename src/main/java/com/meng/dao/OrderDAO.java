package com.meng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meng.model.Address;
import com.meng.model.Food;
import com.meng.model.Order;
import com.meng.model.Time;
import com.meng.util.PageUtil;

@Mapper
public interface OrderDAO {

	List<Time> getTimeList();

	List<Address> getAddressList();

	List<Food> getFoodList();

	void addOneOrder(Order order);

	void addOrderFood(@Param("order")Order order, @Param("i")int i);

	int getMaxOid();

	List<Order> getOrderList(PageUtil pageUtil);

	int getOrderCount();

}
