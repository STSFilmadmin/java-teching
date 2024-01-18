package com.dmdev.oop.lesson21;

public class Student {
	int age;
	private String name;

	public int getAge() {
		return age;
	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
