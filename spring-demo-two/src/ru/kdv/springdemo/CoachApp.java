package ru.kdv.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(coach.getAdvise());
		System.out.println(coach.getWorkout());
		context.close();
	}

}
