package com.java.springboot;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	public HappyFortuneService() {
		System.out.println("HappyFortuneService default constructor!!!");
	}

	@Override
	public String getMyFortune() {
		return "HappyFortuneService : Your Lucky Day";
	}

}
