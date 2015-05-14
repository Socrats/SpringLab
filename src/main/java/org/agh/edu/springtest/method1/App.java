package org.agh.edu.springtest.method1;

import org.agh.edu.springtest.order.IOrderGenerator;
import org.agh.edu.springtest.order.impl.PhoneOrderGenerator;

/**
 * Method 1: Call the object directly
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	IOrderGenerator order = new PhoneOrderGenerator();
        order.generateOrder();
    }
}
