package com.qa.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.qa.app.encapsulation.Customer;
import com.qa.app.inheritance.Child;
import com.qa.app.inheritance.GrandParent;
import com.qa.app.inheritance.Parent;
import com.qa.app.polymorphism.Car;
import com.qa.app.polymorphism.Vehicle;

public class Runner {

	public static void method() throws ArithmeticException {
		System.out.println(3 / 0);
	}

	public static void main(String[] args) {

		// ---------Exceptions

		int[] arr1 = { 23, 24, 25, 26, 34 };

//		System.out.println(arr1[5]);

		try {
			// code to try
			System.out.println(arr1[5]);
			System.out.println("try");
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(arr1[1]);
			System.out.println("catch array out of bounds");
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println(arr1[4]);
			System.out.println("catch arithmetic");
		} finally {
			System.out.println("you have reached the end");
		}

		try {
			method();
		} catch (ArithmeticException e) {
			System.out.println("cant divide by 0");
		}

		// --------Scanner - allows for user input via the console
//		ArrayList<Customer> cList = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		String exit;
//		do {
//			System.out.println("Enter your name: ");
//			String name = sc.nextLine();
//			System.out.println("Your name is: " + name);
//
//			System.out.println("Enter your age: ");
//			int age = sc.nextInt();
//			sc.nextLine();// captures the enter key - is a character not a numeric
//			System.out.println("Your age is: " + age);
////			sc.nextDouble(); // numbers and .
//			System.out.println("Enter your address: ");
//			String address = sc.nextLine();
//			System.out.println("Your address is: " + address);
//
//			System.out.println("Enter your account number: ");
//			int accNo = sc.nextInt();
//			sc.nextLine();// captures the enter key
//			System.out.println("Your account number is: " + accNo);
//
////			System.out.println("Enter your DOB: ");
////			int dob = sc.nextInt();
////			System.out.println("Your DOB is: " + dob);
//
//			Customer xyz = new Customer(name, age, address, accNo);
//			cList.add(xyz);
//			System.out.println(xyz.toString());
//
//			System.out.println("Do you want to add another customer? (y/n)");
//			exit = sc.nextLine().toLowerCase();
//		} while (exit.equals("y"));
//		System.out.println(cList);
//		System.out.println("Terminated program");

		// ---Inheritance
//		GrandParent w = new GrandParent();
//		w.genes();		
//		
//		Parent x = new Parent();
//		x.info();// method in parent class
//		x.genes();// method in grandparent class
//		
//		Child y = new Child();
//		y.info();//method in parent class
//		y.personailty(); // method in child class
//		y.genes();// method in grandparent class

		// ---Encapsulation
//		Customer a = new Customer();
//		System.out.println(a.toString());
//		a.setName("ash");
//		a.setAge(03);
//		a.setAddress("ireland");
//		a.setAccountNo(243);
//		System.out.println(a.toString());
//		System.out.println(a.getName());
//		
//		System.out.println("------constructor with fields");
//		Customer b = new Customer("ash", 10, "tbc", 393);
//		System.out.println(b.toString());
//		b.setAddress(null);
//		
//		Customer c = new Customer("bob", 64, "uk", 122);
//		System.out.println(c.toString());

		// ---Polymorphism
//		Vehicle d = new Vehicle();
//
//		Vehicle f = new Vehicle(120, "car", "blue");
//		System.out.println(f.topSpeed());// 210
//		System.out.println(f.topSpeed(345));// 345
//		f.add(0, "+", 0);
//
//		Car a5 = new Car();
//		System.out.println(a5.topSpeed() + " - CAR");

	}

}
