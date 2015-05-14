package org.agh.edu.springtest.method3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.agh.edu.springtest.order.OrderHelperSpring;

/**
 * Method 3: Use Spring Dependency Injection (DI). Loosely Coupled.
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	    	   new ClassPathXmlApplicationContext(new String[] {"Spring-springtest.xml"});
    	 
    	    	OrderHelperSpring order = (OrderHelperSpring)context.getBean("OrderHelperSpring");
    	    	order.generateOrder();
    	    	
    }
}
