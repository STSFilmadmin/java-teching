package com.dmdev.lesson24;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime now =  ZonedDateTime.now();
		System.out.println(now);
		
		long toEpochMilli = now.toInstant().toEpochMilli();
		System.out.println(toEpochMilli);
		
		ZonedDateTime plus = now.plus(5L, ChronoUnit.DAYS);
		System.out.println(plus);
		
		ZonedDateTime plusDays = now.plusDays(10);
		System.out.println(plusDays);
	}

}
