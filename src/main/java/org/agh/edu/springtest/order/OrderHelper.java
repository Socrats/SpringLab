package org.agh.edu.springtest.order;

import org.agh.edu.springtest.order.IOrderGenerator;
import org.agh.edu.springtest.order.impl.PhoneOrderGenerator;

public class OrderHelper {

	IOrderGenerator orderGenerator;
	
	public OrderHelper() {
		setOrderGenerator(new PhoneOrderGenerator());
	}
	
	public void generateOrder () {
		orderGenerator.generateOrder();
	}
	
	public void setOrderGenerator(IOrderGenerator orderGenerator) {
		this.orderGenerator = orderGenerator;
	}
	
}
