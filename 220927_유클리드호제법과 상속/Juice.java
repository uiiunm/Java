package edu;

public class Juice extends Drinks {
	private String dept;

	public Juice() {
		super();
		System.out.println("Juice 생성자 실행!");
	}

	public Juice(String name, int price, String dept) {
		super(name, price);
		this.dept = dept;
		System.out.println("Juice(name,pirce,dept) 생성자 실행!");
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + ":" + dept;
	}

}