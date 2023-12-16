package com.dmdev.oop.lesson7;

public class CompositionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ram ram = new Ram(8192 * 4);
		Ssd ssd = new Ssd(1024 * 2);
		Computer computer = new Computer(ram, ssd);
		computer.printState();
	}

}
