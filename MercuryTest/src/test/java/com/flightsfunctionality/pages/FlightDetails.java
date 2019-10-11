package com.flightsfunctionality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mercury.library.Base;

public class FlightDetails extends Base{
	
	
	public FlightDetails serchingFlight() {
		
		mylibrary.handleCheckBoxRadioBtn(By.name("tripType"),true);
		mylibrary.selectDropDown("1", By.name("passCount"));
		mylibrary.selectDropDown(By.name("fromPort"), "London");
		mylibrary.selectDropDown(By.name("fromMonth"), "May");
		mylibrary.selectDropDown(By.name("fromDay"), "15");
		mylibrary.selectDropDown(By.name("toPort"), "London");
		mylibrary.selectDropDown(By.name("toMonth"),"September");
		mylibrary.selectDropDown(By.name("toDay"), "3");
		mylibrary.handleCheckBoxRadioBtn(By.name("servClass"), true);
		mylibrary.clickButton(By.name("airline"));
		mylibrary.clickButton(By.name("findFlights"));
		WebElement chooseFormatElem = mylibrary.fluentWait(By.className("title"));
		Assert.assertNotNull(chooseFormatElem, "Waiting for FindFlights page loading - Failed");
		return this;
	}
	

	
	
	

}
