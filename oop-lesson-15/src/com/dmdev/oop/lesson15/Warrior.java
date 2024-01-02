package com.dmdev.oop.lesson15;

public class Warrior extends Hero {

    public Warrior(String name, int damage, int heat) {
        super(name, damage, heat);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " помахав мечом на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}