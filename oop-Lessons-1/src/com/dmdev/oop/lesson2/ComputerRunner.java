package com.dmdev.oop.lesson2;

public class ComputerRunner {

	public static void main(String[] args) {
		Computer computer = new Computer();

		computer.printState();

		computer.load("PS_1");

		Computer computer2 = new Computer(1024);
		computer.load("computer", true);
		computer2.printState();
		computer2.load("PS_2");
		

		Computer computer3 = new Computer(2048, 8000);

		computer3.printState();
		computer3.load("PS_3");
		
	}

}
