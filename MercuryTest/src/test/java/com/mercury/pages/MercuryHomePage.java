package com.mercury.pages;

import static org.testng.Assert.assertEquals;

import com.mercury.library.Base;

public class MercuryHomePage extends Base {

	public void Go_to_website() {
		driver.get("http://newtours.demoaut.com/");
		String actualpageTitle = driver.getTitle();
		System.out.println("Website title is : " + actualpageTitle);
		assertEquals(actualpageTitle, "Welcome: Mercury Tours");
	}
	
	
}