package com.amstech.std.system.controller;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.amstech.std.system.service.OrderService;
import com.fasterxml.jackson.annotation.JacksonInject;

import jakarta.inject.Inject;

@RestController("/orders")
public class OrderController {
	@Autowired
private OrderService orderService;
	
	public OrderController() {
		System.out.println("OrderControllr: Object created");
				
	}
   @Inject
	private void init() {
		System.out.println("OrderController: init method");
		save();
	}
	
	public void save() {
		orderService.saveOrder();
	}

}
