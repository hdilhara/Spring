package com.thilina.springmvc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringApp {

	public static void main(String[] args) {

		//Load the Spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("contextApplicationXML.xml");

		//retrieve bean from spring container
		Coach coach=context.getBean("myCoach", Coach.class);
		System.out.println(coach.getWorkout());
		
		//close the context 
		context.close();
	}

}
