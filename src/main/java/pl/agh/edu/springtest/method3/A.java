package pl.agh.edu.springtest.method3;

import pl.agh.edu.springtest.elements.IElement;

/**
 * Method 3: Use Spring Dependency Injection (DI). Loosely Coupled.
 *
 */
public class A 
{
	IElement element;
	
	public void testRun() {
		System.out.println("Class A uses element " + this.element.printMessage());
	}
	
	public void setElement (IElement element) {
		this.element = element;
	}
	
}
