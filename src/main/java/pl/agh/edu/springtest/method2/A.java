package pl.agh.edu.springtest.method2;

import pl.agh.edu.springtest.elements.ElementHelper;
import pl.agh.edu.springtest.elements.IElement;

/**
 * Method 2: Use a Helper class.
 *
 */
public class A 
{
	ElementHelper element;
	
	public A(IElement element)
	{
		this.element = new ElementHelper(element);
	}
	
	public void testRun() 
	{
		System.out.println("Class A uses element " + this.element.printMessage());
	}
}
