package edu.game;

class Airplane extends Unit {

	public Airplane(String attack, String move, int power) {

		super(attack, move, power);

	}

	public void war() {

		System.out.println("[AIRPLANE]");

		super.war();

		System.out.println();

	}
}