package ru.kdv.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Autowired
	@Qualifier("fileAdvisoryFactory")
	AdviseFactory adviseFactory;

	@Autowired	
	public SwimCoach(@Qualifier("fileAdvisoryFactory")AdviseFactory adviseFactory) {
		this.adviseFactory = adviseFactory;
	}

	@Override
	public String getWorkout() {
		return "Swim more";
	}

	@Override
	public String getAdvise() {
		return adviseFactory.getAdvise();
	}

}
