package com.tnsif.dayfour;

import java.util.Scanner;

public class GetterSetterPersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetterSetterDemo p1 = new GetterSetterDemo(); // default constructor invoked

		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		// p1.personName=name private member can't accessible
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p1 = new GetterSetterDemo(name, age, city); // parameterized constructor invoked);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());
		sc.close();

	}

}
