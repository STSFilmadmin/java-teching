package com.dmdev.oop.lesson15;

public class Archer extends Hero {
    private Wolf wolf;

    public Archer(String name, int damage, int heat) {
	super(name, damage, heat);
	this.wolf = new Wolf("бобик ", 10);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
	System.out.println(getName() + " стрельнул з лука в " + enemy.getName());
	wolf.attackEnemy(enemy);
    }

    private class Wolf {

	private String name;
	private int damage;

	public Wolf(String name, int damage) {
	    super();
	    this.name = name;
	    this.damage = damage;
	}

	public void attackEnemy(Enemy enemy) {
	    System.out.println("вовчик " + name + " покусав " + " і " + Archer.this.getName() + " бють ворога");
	    enemy.takeDamage(damage + Archer.this.getDamage());
	}

    }

}
