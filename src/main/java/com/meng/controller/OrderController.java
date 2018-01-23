package com.meng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meng.model.Address;
import com.meng.model.Food;
import com.meng.model.Order;
import com.meng.model.Time;
import com.meng.service.OrderService;
import com.meng.util.PageUtil;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("toAddOneOrder")
	public String toAddOneOrder(Model model) {
		List<Time> timeList=orderService.getTimeList();
		List<Address> addressList=orderService.getAddressList();
		List<Food> foodList=orderService.getFoodList();
		
		model.addAttribute("timeList", timeList);
		model.addAttribute("addressList", addressList);
		model.addAttribute("foodList", foodList);
		return "addOrder";
	}
	
	@RequestMapping("addOneOrder")
	public String addOneOrder(Order order,int[] fid) {
		
		int oid=orderService.getMaxOid();
		order.setOid(oid);
		orderService.addOneOrder(order);
		orderService.addOrderFood(order,fid);
		
		
		
		return "redirect:toOrderList";
		
	}
	
	@RequestMapping("toOrderList")
	public String toOrderList(Model model,String page) {
		int count=orderService.getOrderCount();
		PageUtil pageUtil=new PageUtil(page, 4, count);
		List<Food> foodList=orderService.getFoodList();
		List<Order> list=orderService.getOrderList(pageUtil);
		model.addAttribute("list", list);
		model.addAttribute("foodList", foodList);
		model.addAttribute("pageUtil", pageUtil);
		return "list";
	}
	
}




