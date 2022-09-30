package edu.game;

public class Tank extends Unit {

	public Tank(String attack, String move, int power) {

		super(attack, move, power);

	}

	public void war() {

		System.out.println("[TANK]");

		super.war();

		System.out.println();

	}

}