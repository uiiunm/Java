package edu.game;

class Soldier extends Unit {

	public Soldier(String attack, String move, int power) {

		super(attack, move, power);

	}

	public void war() {

		System.out.println("[SOLDIER]");

		super.war();

		System.out.println();

	}

}