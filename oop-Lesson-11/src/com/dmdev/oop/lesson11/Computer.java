package com.dmdev.oop.lesson11;

public abstract class Computer implements Printable{

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {

	this.ssd = ssd;
	this.ram = ram;
    }

    public Computer() {
	System.out.println("Constructor computer");
    }

    public abstract void load();
    @Override
    public void print() {
	System.out.println("Ssd " + ssd.getValue() + " Ram " + ram.getValue());
    }

    public Ssd getSsd() {
	return ssd;
    }

    public Ram getRam() {
	return ram;
    }
}