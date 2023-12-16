package com.dmdev.oop.lesson7;

public class Computer {
	private Ram ram;
	private Ssd ssd;
	private static int counter = 0;

	public Computer(Ram ram, Ssd ssd) {
		super();
		this.ram = ram;
		this.ssd = ssd;
		counter ++;
	}
	

	public static int getCounter() {
		return counter;
	}


	public void printState() {
		System.out.println("Computer: \nram " + ram.getVaule() + " Gb"+ "\n" + "ssd " + ssd.getVaule()+ " Gb");
	}

}
