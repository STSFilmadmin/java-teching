package com.dmdev.oop.lesson7;

public class Computer {
	private Ram ram;
	private Ssd ssd;

	public Computer(Ram ram, Ssd ssd) {
		super();
		this.ram = ram;
		this.ssd = ssd;
	}

	public void printState() {
		System.out.println("Computer: \nram " + ram.getVaule() + " Gb"+ "\n" + "ssd " + ssd.getVaule()+ " Gb");
	}

}
