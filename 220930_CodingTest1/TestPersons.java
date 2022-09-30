package test;

abstract class Person {
	String pnum;
	String name;
	int age;

	public Person(String pnum, String name, int age) {
		super();
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return pnum + " : " + name + " : " + age;
	}

	abstract void show(); // toString()를 호출하여 sysout으로 처리

	abstract void increase(); // salary, scholarship, or dayPay를 10% 증가

}

class Employee extends Person {
	private String job;
	private String dept;
	private int salary;

	public void show() {
		System.out.println(super.toString() + ":" + job + ":" + dept + ":" + salary);

	}

	public void increase() {
		this.salary += 0.1 * salary;

	}

	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

}

class Designer extends Employee {
	private String language;
	private int workYear;
	private int salary;

	public void show() {
		System.out.println(super.toString() + ":" + language + ":" + workYear);

	}

	public void increase() {
		this.salary += 0.1 * salary;

	}

	public Designer(String pnum, String name, int age, String job, String dept, int salary, String language,
			int workYear) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;

	}

}

class Student extends Person {
	private String schoolName;
	private int schoolYear;
	private int scholarship;

	public void show() {
		System.out.println(super.toString() + ":" + schoolName + ":" + schoolYear + ":" + scholarship);

	}

	public void increase() {
		this.scholarship += 0.1 * scholarship;

	}

	public Student(String pnum, String name, int age, String schoolName, int schoolYear, int scholarship) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolYear = schoolYear;
		this.scholarship = scholarship;
	}

}

class WorkStudent extends Student {
	private String job;
	private int dayPay;

	public void show() {
		System.out.println(super.toString() + ":" + job + ":" + dayPay);

	}

	public void increase() {
		this.dayPay += 0.1 * dayPay;

	}

	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolYear, int scholarship,
			String job, int dayPay) {
		super(pnum, name, age, schoolName, schoolYear, scholarship);
		this.job = job;
		this.dayPay = dayPay;
	}

}

public class TestPersons {
	static void showAll(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].show(); // 동적바인딩 구현
		}
	}

	static void increaseAll(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].increase(); // 동적바인딩 구현
		}
	}

	static void getData(Person[] p) {
		Employee e = new Employee("pnum1", "name1", 10, "job1", "dept1", 10);
		Designer d = new Designer("pnum2", "name2", 20, "job2", "dept2", 20, "java", 10);
		Student s = new Student("pnum3", "name3", 30, "job3", 30, 30);
		WorkStudent w = new WorkStudent("pnum4", "name4", 40, "job4", 40, 40, "s", 40);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;
	}

	public static void main(String[] args) {
		Person[] setPerson = new Person[4];
		getData(setPerson);
		showAll(setPerson);
		increaseAll(setPerson);
		showAll(setPerson);
	}

}
