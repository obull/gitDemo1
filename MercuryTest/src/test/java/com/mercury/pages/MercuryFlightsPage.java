package com.mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mercury.library.Base;

public class MercuryFlightsPage extends Base {

	public MercuryFlightsPage Flights() throws InterruptedException {
	mylibrary.enterTextField(By.name("userName"), "mercury");	
	mylibrary.enterTextField(By.name("password"),"mercury");
	mylibrary.clickButton(By.name("login"));
	WebElement chooseFormatElem = mylibrary.fluentWait(By.name("findFlights"));
	Assert.assertNotNull(chooseFormatElem, "Waiting for FindFlights page loading - Failed");
	
		return this;
	}
}