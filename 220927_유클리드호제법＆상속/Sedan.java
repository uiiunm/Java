package edu;

public class Sedan extends Vehicle {
	private String qwer;

	public Sedan() {
		super();
		System.out.println("Sedan 생성자 실행!");
	}

	public Sedan(String name, int price, int weight, String qwer) {
		super(name, price, weight);
		this.qwer = qwer;
		System.out.println("Sedan(name,pirce,weight) 생성자 실행!");
	}

	public String getQwer() {
		return qwer;
	}

	public void setQwer(String qwer) {
		this.qwer = qwer;
	}

	public String toString() {
		return super.toString() + ":" + qwer;
	}

}
