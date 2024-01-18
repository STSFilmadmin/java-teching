package com.dmdev.oop.lesson21;

import java.util.stream.Stream;

public class MapReduceExample {

	/*
	 * 
	 * [1000_000]-> age -> max
	 *
	 * [1000_000]-> age -> max-> max
	 *
	 * [1000_000]-> age -> max
	 * 
	 * 
	 *  
	 */
	public static void main(String[] args) {
		Stream.of(
			new Student(18, "Ivan"),
			new Student(24, "Katya"),
			new Student(38, "Galya"),
			new Student(24, "Ivanka"),
			new Student(19, "Igor"),
			new Student(20, "Dudra"),
			new Student(18, "Kira")
			)	
        .sequential()
        .map(Student::getAge)
        .reduce(Integer::sum)
        .ifPresent(System.out::println);
				
		}
}
