package ru.kdv.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class TennisCoach implements Coach {
	
	private AdviseFactory adviseFactory;
	
	@Autowired
	TennisCoach(@Qualifier("fileAdvisoryFactory")AdviseFactory adviseFactory){
		this.adviseFactory = adviseFactory;
	}
	
	@Override
	public String getWorkout() {
		return "Go play tennis more!";
	}
	
	@Override
	public String getAdvise() {
		return adviseFactory.getAdvise();
	}

}
