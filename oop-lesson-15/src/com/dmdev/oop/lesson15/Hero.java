package com.dmdev.oop.lesson15;

public abstract class Hero {

    private String name;
    private int damage;
    private int heat;
    

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public Hero(String name, int damage, int heat ) {
        this.name = name;
        this.damage = damage;
        this.heat = heat ;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    protected static boolean isAlive() {
	return false;
    }
}