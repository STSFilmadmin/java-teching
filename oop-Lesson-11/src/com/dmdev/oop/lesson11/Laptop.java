package com.dmdev.oop.lesson11;

/**
 * Laptop <- Computer <- Object
 */
public final class Laptop extends Computer {
    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
	super(ssd, ram);
	this.weight = weight;
    }

    public Laptop() {
	System.out.println("Constructor laptop");
    }

    public static void open() {
	System.out.println("відкрив  кришку");
    }

    public int getWeight() {
	return weight;
    }

    @Override
    public void load() {
	open();
	System.out.println("я загрузився");
    }

    @Override
    public  void print() {
	super.print();
	System.out.println("weight " + weight);
    }

}