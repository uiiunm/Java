package edu;

public class Drinks {
	private String name;
	private int price;

	public Drinks() {
		System.out.println("Drink 생성자 실행!");
	}

	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return name + ":" + price;
	}

}