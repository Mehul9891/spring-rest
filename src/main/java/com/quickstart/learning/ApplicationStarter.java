package com.quickstart.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStarter {

	private static ClassPathXmlApplicationContext context=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				new ApplicationStarter().shutdown();
			}
		});
		
		context.start();
		
		ShapeFinder shape = (ShapeFinder)context.getBean("shapeFinder");
		
		shape.draw();
		
		DisplayName displayName = (DisplayName)context.getBean("displayName");
		displayName.display();
	}
	
	private void shutdown() {
		
		System.out.println("Shutting down context");
		context.close();
	}
	
	

}
