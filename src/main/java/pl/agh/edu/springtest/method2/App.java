package pl.agh.edu.springtest.method2;

import pl.agh.edu.springtest.elements.impl.*;


public class App {

	public static void main(String[] args) {
		A a1 = new A(new B());
		a1.testRun();
		A a2 = new A(new C());
		a2.testRun();
	}

}
