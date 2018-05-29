package com.java.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TennisCoach tc = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(tc.getDailyWorkouts());
		System.out.println(tc.getTodayFortune());
		context.close();
	}

}
