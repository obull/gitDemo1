package com.mercury.pages;


import org.openqa.selenium.By;

import com.mercury.library.Base;

public class  RegisterPageMercury extends Base {	
 
	public  RegisterPageMercury register() {
    mylibrary.clickButton(By.xpath(" //a[contains(text(),'REGISTER')] "));
    return this;
	}
	public RegisterPageMercury personalInformation() {
	mylibrary.enterTextField(By.xpath("//input[@name='firstName']"), "reyhan");
	mylibrary.enterTextField(By.xpath("//input[@name='lastName']"), "obull");
	mylibrary.enterTextField(By.xpath("//input[@name='phone']"), "402-865-855");
	mylibrary.enterTextField(By.xpath("//input[@name='userName']"), "reyhanobull@gmail.com");
	mylibrary.enterTextField(By.xpath("//input[@name='address1']"), "11118germantoun roude");
	mylibrary.enterTextField(By.xpath("//input[@name='city']"), "fairfax");
	mylibrary.enterTextField(By.xpath("//input[@name='state']"), "va");
	mylibrary.enterTextField(By.xpath("//input[@name='postalCode']"),"22033" );
	//mylibrary.enterTextField(By.name
		//	("//input[@name='postalCode']"),"22033" );
	
	mylibrary.selectDropDown(By.name("country"),"UNITED STATES ");
	mylibrary.enterTextField(By.name("email"), "reyhangul");
	mylibrary.enterTextField(By.name("password"), "575757");
	mylibrary.enterTextField(By.name("confirmPassword"), "575757");
	mylibrary.clickButton(By.xpath("//input[@name='register']"));
	
	return this;
}
}