package com.dmdev.oop.lesson20.exception;

/*	1. оголосіть змінну зі значенням null. Викличте метод у цієї
*	змінної. Відловіть виняток, що виник.
*/

public class Task1 {
    public static void main(String[] args) {
	String vaule = null;
	try {
	vaule.length();
	}catch (NullPointerException e) {
	    System.err.println("Catch");
	    e.printStackTrace();
	}	
    }

}
