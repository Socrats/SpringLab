package pl.agh.edu.springtest.method3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main( String[] args )
    {
    	ApplicationContext context = 
    	    	   new ClassPathXmlApplicationContext(new String[] {"Spring-springtest.xml"});
    	 
    	    	A a = (A)context.getBean("A");
    	    	a.testRun();
    	    	
    }

}
