package com.qa.app.encapsulation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
	
	Customer cust = new Customer();//the class we are testing
	Customer x;

	@BeforeAll //JUNIT4 - BeforeClass
	public static void start() {
		System.out.println("Before All");
		//connecting to a database
	}

	@BeforeEach //JUNIT4 - Before
	public void setUp() {
		x = new Customer("x", 0, null, 0);
		cust.setName("Ash");
		cust.setAge(23);
		cust.setAddress("London");
		cust.setAccountNo(5544);
		System.out.println("Before Each");
		//initialise test data
	}

	@Test
	public void testGetName() {
		//test if your method does what you expect it to, you need assertions
		Assertions.assertEquals("Ash",cust.getName());
		Assertions.assertEquals("x",x.getName());
		Assertions.assertNotEquals(null, cust.getName());
		System.out.println("Test");
	}
	
	@Test
	public void testGetAge() {
		Assertions.assertEquals(23,cust.getAge());
		Assertions.assertNotEquals(0, cust.getAge());
		System.out.println("Test 2");
	}
	@Test
	public void testGetAddress() {
		Assertions.assertEquals("London",cust.getAddress());
		Assertions.assertNotEquals(null, cust.getAddress());
		System.out.println("Test 2");
	}@Test
	public void testGetAccount() {
		Assertions.assertEquals(5544,cust.getAccountNo());
		Assertions.assertNotEquals(0, cust.getAccountNo());
		System.out.println("Test 2");
	}
	@Test
	public void testTostring() {
		String out = "Customer [name=Ash, age=23, address=London, accountNo=5544]";
		Assertions.assertEquals(out, cust.toString());
		System.out.println("Test 2");
	}

	//2 records
	//create test - passed in 1 record
	//read test - 2 record outputs
	
	@AfterEach //JUNIT4 - After
	public void clean() {
		System.out.println("After Each");
		//clear any data
	}

	@AfterAll //JUNIT4 - AfterClass
	public static void stop() {
		System.out.println("After all");
		//closing connection
	}
}
