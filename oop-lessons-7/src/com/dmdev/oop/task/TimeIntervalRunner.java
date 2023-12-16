package com.dmdev.oop.task;

/**
 * 1. Створити клас, що описує проміжок часу. Сам проміжок часу має задаватися
 * трьома властивостями: секундами, хвилинами та годинами. Створити метод для
 * отримання повної кількості секунд в об'єкті Створити два конструктори: перший
 * приймає загальну кількість секунд, другий - години, хвилини та секунди
 * окремо. Створити метод для виведення даних.
 *
 */

public class TimeIntervalRunner {
	public static void main(String[] args) {
		TimeInterval timeInterval = new TimeInterval(30, 2, 1);
		System.out.println(timeInterval.totalSeconds());
		//timeInterval.print();

		TimeInterval timeInterval2 = new TimeInterval(55555);
		timeInterval2.print();
		
		TimeInterval sumInterval= timeInterval.sum(timeInterval2);
		System.out.println("123");
		sumInterval.print();
		
	}

}
