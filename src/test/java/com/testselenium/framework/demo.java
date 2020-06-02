package com.testselenium.framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo {

	@Test
	public void demo(){
		System.out.println("Hello");
	}
	
	@Test
	public void King(){
		System.out.println("King");
	}
	
	@BeforeClass
	public void befclass(){
		System.out.println("before class method");
	}
	
	@AfterMethod
	public void aftMethod(){
		System.out.println("After method demo class");
	}
	
	@AfterTest
	public void aftTest(){
		System.out.println("after test method");
	}
	
	@BeforeSuite
	public void befSuite(){
		System.out.println("before suite method demo class");
	}
}
