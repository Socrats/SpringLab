package org.agh.edu.springtest.order.impl;

import org.agh.edu.springtest.order.IOrderGenerator;

public class EmailOrderGenerator implements IOrderGenerator{
	
	public void generateOrder() {
		System.out.println("Order by Email!");
		
	}

}

