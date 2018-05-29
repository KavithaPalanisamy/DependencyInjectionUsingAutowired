package com.java.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fs;

	public TennisCoach() {
		System.out.println("Tennis coach default constructor!!!");
	}

	@Override
	public String getDailyWorkouts() {
		return "Tennis workout: 10 mins!!!";
	}

	@Override
	public String getTodayFortune() {
		return fs.getMyFortune();
	}

}
