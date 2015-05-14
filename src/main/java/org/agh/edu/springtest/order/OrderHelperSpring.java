package org.agh.edu.springtest.order;

import org.agh.edu.springtest.order.IOrderGenerator;

public class OrderHelperSpring {

	IOrderGenerator orderGenerator;
	
	public void generateOrder() {
		orderGenerator.generateOrder();
	}
	
	public void setOrderGenerator (IOrderGenerator orderGenerator) {
		this.orderGenerator = orderGenerator;
	}
	
}
