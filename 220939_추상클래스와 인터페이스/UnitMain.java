package edu.game;

public class UnitMain {

	public static void main(String[] args) {

		{

			Tank t = new Tank("Russia", "North", 100);
			t.war();

			Airplane a = new Airplane("China", "West", 200);
			a.war();

			Submarine su = new Submarine("Japan", "East", 300);
			su.war();

			Soldier so = new Soldier("Taiwan", "South", 400);
			so.war();

		}

		System.out.println("=========");

		{

			WarIntf[] u = new WarIntf[4];

			u[0] = new Tank("Russia", "North", 100);

			u[1] = new Airplane("China", "West", 200);

			u[2] = new Submarine("Japan", "East", 300);

			u[3] = new Soldier("Taiwan", "South", 400);

			for (WarIntf t : u) {
				if (t != null)
					t.war();

			}

		}
		System.out.println("=========");
	}

}
/*
 * class Unit {
 * 
 * private String attack; private String move; private int power;
 * 
 * public Unit() {
 * 
 * attack = ""; move = ""; power = 0;
 * 
 * }
 * 
 * public Unit(String attack, String move, int power) {
 * 
 * this.attack = attack; this.move = move; this.power = power;
 * 
 * }
 * 
 * public void war() {
 * 
 * System.out.printf("%s를 공격합니다. %s로 움직입니다. %d만큼 공격합니다", attack, move, power); }
 * 
 * }
 * 
 * class Tank extends Unit {
 * 
 * public Tank(String attack, String move, int power) {
 * 
 * super(attack, move, power);
 * 
 * }
 * 
 * public void war() {
 * 
 * System.out.println("[TANK]");
 * 
 * super.war();
 * 
 * System.out.println();
 * 
 * }
 * 
 * }
 * 
 * class Airplane extends Unit {
 * 
 * public Airplane(String attack, String move, int power) {
 * 
 * super(attack, move, power);
 * 
 * }
 * 
 * public void war() {
 * 
 * System.out.println("[AIRPLANE]");
 * 
 * super.war();
 * 
 * System.out.println();
 * 
 * }
 * 
 * }
 * 
 * class Submarine extends Unit {
 * 
 * public Submarine(String attack, String move, int power) {
 * 
 * super(attack, move, power);
 * 
 * }
 * 
 * public void war() {
 * 
 * System.out.println("[SUBMARINE]");
 * 
 * super.war();
 * 
 * System.out.println();
 * 
 * }
 * 
 * }
 * 
 * class Soldier extends Unit {
 * 
 * public Soldier(String attack, String move, int power) {
 * 
 * super(attack, move, power);
 * 
 * }
 * 
 * public void war() {
 * 
 * System.out.println("[SOLDIER]");
 * 
 * super.war();
 * 
 * System.out.println();
 * 
 * }
 * 
 * }
 */