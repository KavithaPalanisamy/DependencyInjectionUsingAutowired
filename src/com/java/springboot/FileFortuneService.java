package com.java.springboot;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	String[] fortune = { "a", "b", "c", "d", "e" };

	@Override
	public String getMyFortune() {
		return fortune[getRandom()];
	}

	public int getRandom() {
		Random ran = new Random();
		return ran.nextInt(fortune.length);
	}
}
