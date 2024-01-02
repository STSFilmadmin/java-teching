package com.dmdev.oop.lesson15;

public class Mage extends Hero {

    public Mage(String name, int damage, int heat) {
        super(name, damage, heat);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " авада кедавра на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}