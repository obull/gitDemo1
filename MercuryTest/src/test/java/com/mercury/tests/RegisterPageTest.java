package com.mercury.tests;

import org.testng.annotations.Test;

import com.mercury.library.Base;
import com.mercury.pages.MercuryHomePage;
import com.mercury.pages.RegisterPageMercury;

public class RegisterPageTest extends Base {
	MercuryHomePage mhp = new MercuryHomePage();
	RegisterPageMercury ap =  new RegisterPageMercury();

	@Test
	public void Registerpagetest1() {
		try {
			mhp.Go_to_website();
			ap.register();
			Thread.sleep(2000);
			ap.personalInformation();
			Thread.sleep(2000);
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
