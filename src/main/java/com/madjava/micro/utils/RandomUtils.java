package com.madjava.micro.utils;

import java.util.Random;

public class RandomUtils {

	public static String getRandomNumber() {
		int max = 1000000;
		int min = 100000;
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return String.valueOf(s);
	}
	
	public static void main(String[] args) {
		System.out.println(RandomUtils.getRandomNumber());
	}
}
