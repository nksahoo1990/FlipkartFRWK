package com.testselenium.framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	@Test
	public void demo(){
		System.out.println("Welcome");
	}
	
	@Test
	public void test1(){
		System.out.println("Hii");
	}
	
	@Test
	public void test3(){
		System.out.println("Hii Nitya");
	}
	
	@Test
	public void test2(){
		System.out.println("Woo");
	}
	
	@BeforeMethod
	public void befMethod(){
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void aftMethod(){
		System.out.println("After method test class");
	}
	
	@AfterClass
	public void befclass(){
		System.out.println("after class method");
	}
	
	@BeforeTest
	public void befTest(){
		System.out.println("before test method");
	}
	
	@AfterTest
	public void aftTest(){
		System.out.println("after test method Test class");
	}
	
	@AfterSuite
	public void aftSuite(){
		System.out.println("after suite method Test class");
	}
}
