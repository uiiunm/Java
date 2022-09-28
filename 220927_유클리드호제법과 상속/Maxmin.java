package edu;

// 22 09 27 최대공약수&최소공배수

public class Maxmin {

	private int num1;
	private int num2;

	public Maxmin() {
	}

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("A : ");
//		int a = sc.nextInt();
//		System.out.println("B : ");
//		int b = sc.nextInt();
//
//		Maxmin nm = new Maxmin(); // **새로만든 클래스
//		nm.num1 = a;
//		nm.num2 = b;
//
//		nm.print(); // 함수 선언으로 처리**
//	}

	public Maxmin(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void print() {
		// 최소공배수와 최대공약수를 구한다. 유클리드 호제법
		// num1 : a, num2 : b
		int max;
		int min;

		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}

		int rem = max % min;
		while (rem != 0) {
			max = min;
			min = rem;
			rem = max % min;
		}

		if (min == 1) {
			System.out.print("최대공약수 : 서로소");
		} else {
			System.out.print("최대공약수 : " + min);
		}
		System.out.print("최소공배수 : " + (num1 * num2) / min);
	}
}
