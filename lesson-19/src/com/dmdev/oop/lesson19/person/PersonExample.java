package com.dmdev.oop.lesson19.person;

public class PersonExample {

    public static void main(String[] args) {

	Person ivan = new Person(1, "Ivan2", "Ivanov");
	Person petr = new Person(1, "Ivan", "Ivanov3");
	Person petro = new Person(1, "Ivan", "Ivanov3");
	Person petrenko = new Person(2, "Petr", "Petrov");

	System.out.println(petro.hashCode());
	System.out.println(petr.hashCode());
	System.out.println(petr.equals(petro));
    }
}
