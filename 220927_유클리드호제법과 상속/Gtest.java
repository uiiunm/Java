package edu;

import java.util.Scanner;

public class Gtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Object o = new Object();

		System.out.print("A : ");
		int a = sc.nextInt();
		System.out.print("B : ");
		int b = sc.nextInt();

		Maxmin nm1 = new Maxmin(); // **새로만든 클래스
		nm1.setNum1(a);
		nm1.setNum2(b);
		nm1.print();

//		Maxmin nm2 = new Maxmin(a, b);
//		nm2.print(); // 함수 선언으로 처리**

	}

}
