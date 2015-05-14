package org.agh.edu.springtest.method2;

import org.agh.edu.springtest.order.OrderHelper;

/**
 * Method 2: Use a Helper class.
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	OrderHelper order = new OrderHelper();
        order.generateOrder();
    }
}
