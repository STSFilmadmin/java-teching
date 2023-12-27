package com.dmdev.oop.lesson11;

public class OopLessonRunner {

    public static void main(String[] args) {
	Computer laptop = new Laptop(new Ssd(1512), new Ram(8356), 2);
	Computer mobile = new Mobile(new Ssd(512), new Ram(4056));
	 
	Laptop laptop1 = new Laptop(  new Ssd(5000),new Ram(10000),5);
	
	loadComputers(laptop, mobile);
	printInformations(new Computer[] {laptop, mobile, laptop1 });
    }

    public static void printInformations(Computer[] computers) {
	for (Computer computer : computers) {
	    computer.print();
	    if (computer instanceof Laptop) {
		((Laptop) computer).open();
	    }
	    System.out.println();

	}
    }

    public static void loadComputers(Computer... computers) {
	for (Computer computer : computers) {
	    computer.load();
	    System.out.println();
	}
    }
}
