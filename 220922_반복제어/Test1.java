package edu;

public class Test1 {

	public static void main(String[] args) {

		Armor ar = new Armor();
//		System.out.println("name : " + ar.getName());

//		Armor ar1 = new Armor("홍길동");
//		System.out.println("name : " + ar1.getName());

//		Armor ar2 = new Armor("홍이동", 100, 100, "RED", true);
//		System.out.println("name : " + ar2.getName());

		Armor ar3 = new Armor("홍삼동", 200, 200, "Blue", false);
		System.out.println("name : " + ar3.getName());
		System.out.println("height : " + ar3.getHeight());
		System.out.println("weight : " + ar3.getWeight());
		System.out.println("color : " + ar3.getColor());
		System.out.println("isFly : " + ar3.isFly());
		System.out.println("ar3 : " + ar3.toString());

		// name
		ar.setName("Hyeok");
		String n = ar.getName();

		System.out.println("name :" + n);

		// height
		ar.setHeight(172);
		int h = ar.getHeight();

		System.out.println("color :" + h);

		// weight
		ar.setWeight(100);
		int w = ar.getWeight();

		System.out.println("weight :" + w);

		// color
		ar.setColor("Green");
		String c = ar.getColor();

		System.out.println("color :" + c);

		// isFly
		ar.setFly(true);
		boolean i = ar.isFly();

		System.out.println("isFly :" + i);

	}
}