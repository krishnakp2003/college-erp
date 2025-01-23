package com.amstech.std.system.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public OrderService() {
	System.out.println("OrderService: object created");
	}

	public void saveOrder() {
		System.out.println("save order");
		}
	
}
