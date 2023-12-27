package com.dmdev.oop.lesson11;

import java.util.Iterator;

public class OopLessonRunner2 {

    public static void main(String[] args) {

	Computer laptop = new Laptop(new Ssd(1512), new Ram(8356), 2);
	Computer mobile = new Mobile(new Ssd(512), new Ram(4056));

	printWithRandom(laptop, mobile);

    }

    public static void print(Printable... objects) {
	for (Printable object : objects) {
	    object.print();
	    System.out.println("");
	}

    }
    public static void printWithRandom (Printable... objects) {
   	for (Printable object : objects) {
   	    object.printWithRandom();
   	    System.out.println("");
   	}

       }
}
