package edu.game;

class Submarine extends Unit {

	public Submarine(String attack, String move, int power) {

		super(attack, move, power);

	}

	public void war() {

		System.out.println("[SUBMARINE]");

		super.war();

		System.out.println();

	}

}