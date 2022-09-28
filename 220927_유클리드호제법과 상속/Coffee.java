package edu;

public class Coffee extends Drinks {
	private String country;

	public Coffee() {
		super();
		System.out.println("Coffee 생성자 실행!");

	}

	public Coffee(String name, int price, String country) {
		super(name, price);
		this.country = country;
		System.out.println("Coffee(name,pirce,country) 생성자 실행!");
	}

	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}

	public String toString() {
		return super.toString() + ":" + country;
	}

}