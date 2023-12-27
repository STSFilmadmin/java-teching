package com.dmdev.oop.lesson11;

public class Mobile extends Computer {

    @Override
    public void load() {
	System.out.println("я включився");

    }

    public Mobile(Ssd ssd, Ram ram) {
	super(ssd, ram);
	// TODO Auto-generated constructor stub
    }

}
