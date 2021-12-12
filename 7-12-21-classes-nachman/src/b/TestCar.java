package b;

import c.Person;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person(111, "avi", 32);
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	
	}
}
