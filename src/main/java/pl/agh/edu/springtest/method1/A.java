package pl.agh.edu.springtest.method1;

import pl.agh.edu.springtest.elements.impl.*;;

/**
 * Method 1: Call the object directly
 *
 */
public class A 
{
	B element;
	
	public A()
	{
		this.element = new B();
	}
	
	public void testRun() 
	{
		System.out.println("Class A uses element " + element.printMessage());
	}
}
