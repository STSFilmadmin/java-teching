package com.dmdev.lesson10;



/*Написати функцію, що приймає 2 параметри: рядок і слово - і
повертає true, якщо рядок починається і закінчується цим словом.
*/


public class Task2 {
    public static void main(String[] args) {
	
	String vaule= "123d g dfghj dsjahg dgfas123";
	String word = "123";
	System.out.println(isStartAndEnd(vaule, word ));
	
	
    }
    public static  boolean isStartAndEnd(String target, String word) {
	return target.startsWith(word) && target.endsWith(word);
	
    }
}
