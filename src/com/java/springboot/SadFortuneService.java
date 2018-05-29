package com.java.springboot;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getMyFortune() {
		return "SadFortuneService : Today is your Lucky day!!!";
	}

}
