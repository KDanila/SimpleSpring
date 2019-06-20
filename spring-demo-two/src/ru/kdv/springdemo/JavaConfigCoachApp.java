package ru.kdv.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigCoachApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("swimCoach",Coach.class);
		System.out.println(coach.getAdvise());
		System.out.println(coach.getWorkout());
		context.close();
	}

}
