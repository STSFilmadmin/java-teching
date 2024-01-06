package com.dmdev.oop.lesson20.exception;

/*
 * 2. Написати код, який створить, а потім відловить
ArrayIndexOutOfBoundsException.
 */
public class Task2 {
	public static void main(String[] args) {
		int[] vaules = { 1, 2, 5, 6, 9 };

		for (int i = 0; i <= vaules.length; i++) {

			System.out.println(vaules[i]);

		}
	}
} 
