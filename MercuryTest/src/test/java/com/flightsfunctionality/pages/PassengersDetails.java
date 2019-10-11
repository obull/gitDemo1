package com.flightsfunctionality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mercury.library.Base;

public class PassengersDetails extends Base {

	public PassengersDetails PassengerInformation() {
		mylibrary.enterTextField(By.name("passFirst0"), "rayhanjan");
		mylibrary.enterTextField(By.xpath("//input[@name='passLast0']"), "obull");
		mylibrary.selectDropDown(By.name("pass.0.meal"), "Vegetarian");
		mylibrary.selectDropDown(By.name("creditCard"), "MasterCard");
		mylibrary.enterTextField(By.name("creditnumber"), "12345678");
		mylibrary.selectDropDown(By.name("cc_exp_dt_mn"), "03");
		mylibrary.selectDropDown(By.name("cc_exp_dt_yr"), "2010");
		mylibrary.enterTextField(By.name("cc_frst_name"), "rayhan");
		mylibrary.enterTextField(By.name("cc_mid_name"), "obull");
		mylibrary.enterTextField(By.name("billAddress1"), "11108 lincolin street");
		mylibrary.enterTextField(By.name("billCity"), "Nebraska");
		mylibrary.enterTextField(By.name("billZip"), "68501");
		mylibrary.selectDropDown(By.name("billCountry"), "UNITED STATES");
		mylibrary.handleCheckBoxRadioBtn(By.name("ticketLess"), true);
		mylibrary.clickButton(By.name("buyFlights"));
		WebElement chooseFormatElem = mylibrary.fluentWait(By.xpath("//td[3]//a[1]//img[1]"));
		Assert.assertNotNull(chooseFormatElem, "Waiting for FindFlights page loading - Failed");
	   mylibrary.clickButton(By.xpath("//td[3]//a[1]//img[1]"));
		return this;
	}
}