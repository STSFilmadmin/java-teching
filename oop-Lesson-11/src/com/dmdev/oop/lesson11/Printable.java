package com.dmdev.oop.lesson11;

import java.util.Random;

public interface Printable {

    String SOME_VAULE = "Example";
    Random RANDON = new Random();

    default void printWithRandom() {

	System.out.println(generateRandom());
	print();

    }

    void print();

    /* privat */
    static 	int generateRandom() {
	return RANDON.nextInt();
    }
}
