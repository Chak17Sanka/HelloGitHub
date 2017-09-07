package com.chakri.HelloGitHub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        App application = context.getBean("app",App.class);
        application.hello();
    }

	private void hello() {
		System.out.println("Hello World of GITS");
			
	}
}
