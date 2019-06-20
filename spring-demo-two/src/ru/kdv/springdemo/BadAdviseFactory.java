package ru.kdv.springdemo;

public class BadAdviseFactory implements AdviseFactory{

	@Override
	public String getAdvise() {
		return "Super bad advise";
	}

}
