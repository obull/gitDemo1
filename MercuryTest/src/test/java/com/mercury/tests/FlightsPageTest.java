 package com.mercury.tests;

import org.testng.annotations.Test;

import com.flightsfunctionality.pages.FlightDetails;
import com.flightsfunctionality.pages.FlightSelection;
import com.flightsfunctionality.pages.PassengersDetails;
import com.mercury.library.Base;
import com.mercury.pages.MercuryFlightsPage;
import com.mercury.pages.MercuryHomePage;


	public class FlightsPageTest extends Base{
		MercuryFlightsPage fpt= new MercuryFlightsPage();
		MercuryHomePage flt = new MercuryHomePage();
		 FlightDetails fd =  new FlightDetails ();
		 FlightSelection fs = new FlightSelection();
		PassengersDetails fg = new PassengersDetails();
		
		 @Test
		public void FlightsPageTest() {
			try {
				flt.Go_to_website();
				fpt.Flights();
			    fd.serchingFlight();
			    fs.ChooseFlights();
		        fg.PassengerInformation();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		}
}