package edu;

public class DrinksName {

	public static void main(String[] args) {

		Juice nm = new Juice("Fanta", 3000, "USA");
		Coffee op = new Coffee("Latte", 5000, "UK");

		System.out.println(nm.toString());
		System.out.println(op.toString());
	}

}