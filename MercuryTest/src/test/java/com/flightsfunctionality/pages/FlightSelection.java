package com.flightsfunctionality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mercury.library.Base;

public class FlightSelection extends Base {
	
public  FlightSelection ChooseFlights () {
	mylibrary.handleCheckBoxRadioBtn(By.name("outFlight"), true);
	mylibrary.handleCheckBoxRadioBtn(By.name("inFlight"), true);
	mylibrary.clickButton(By.xpath("//input[@name='reserveFlights']"));
	WebElement chooseFormatElem = mylibrary.fluentWait(By.xpath("//input[@name='creditnumber']"));
	Assert.assertNotNull(chooseFormatElem, "Waiting for FindFlights page loading - Failed");
	
	return this;
	

}
}