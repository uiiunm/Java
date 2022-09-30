package edu.game;

public class Unit implements WarIntf {

	private String attack;
	private String move;
	private int power;

	public Unit() {

		attack = "";
		move = "";
		power = 0;

	}

	public Unit(String attack, String move, int power) {

		this.attack = attack;
		this.move = move;
		this.power = power;

	}

	@Override
	public void war() {

		System.out.printf("%s를 공격합니다. %s로 움직입니다. %d만큼 공격합니다", attack, move, power);
	}

}
