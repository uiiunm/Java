package edu;

public class Vehicle {
	private String name;
	private int price;
	private int weight;

	public Vehicle() {
		System.out.println("Vehicle 생성자 실행");
	}

	public Vehicle(String name, int price, int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return name + ":" + price + ":" + weight;
	}

}
