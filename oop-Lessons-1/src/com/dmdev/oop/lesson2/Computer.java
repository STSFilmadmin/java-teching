package com.dmdev.oop.lesson2;

/**
 * Тут має бути опис класу що саме він робить
 * 
 * @author STSFilm
 * @version
 */
public class Computer {

	private int ssd = 512;
	private int ram = 2048;

	Computer() {
		System.out.println("Пустий пк було створено...");
	}

	Computer(int newSSD) {
		ssd = newSSD;
	}

	Computer(int newRam, int newSSD) {
		ram = newRam;
		ssd = newSSD;
	}

	// TODO: Тест тудушки ...
	void load(String computerName) {

		System.out.println("ПК " + computerName + " завантажений...\n");
	}

	void load() {

		System.out.println("ПК  завантажений...\n");
		
	}
	
	void load(String computerName, boolean open) {

		
		if (open) {
			System.out.println("кришка пк відкрита...");
		}
		System.out.println("ПК " + computerName + " завантажений...\n");
	}
	
	void printState() {
		System.out.println("SSD = " + ssd);
		System.out.println("Ram = " + ram);
	}
}
