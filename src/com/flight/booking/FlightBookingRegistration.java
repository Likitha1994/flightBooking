package com.flight.booking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.po.desktop.DesktopPO;

public class FlightBookingRegistration {
	public static String randomString =DesktopPO.generateRandomString() ;
	 static String firstName = "first" + randomString;
	 static String lastName = "last" + randomString;
	 static String emailName = "person" + randomString + "@gmail.com";
	 
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\work\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			DesktopPO desktopMethods= new DesktopPO(driver);
			int randomNumber = DesktopPO.randomNumber(5, 8);
			int randomNumber1 = DesktopPO.randomNumber(1, 4);
			
			//Navigate to 
			driver.navigate().to("http://newtours.demoaut.com/");
			desktopMethods.registerMember();
			
			
			//Personal details 
			desktopMethods.firstName(firstName);
			desktopMethods.lastName(lastName);
			desktopMethods.phoneNumber("7817956755");
			desktopMethods.userName(emailName);
			
			
			//Address details
			desktopMethods.address1("109/A, 16th main road");
			desktopMethods.address2("Koramangala 4th block");
			desktopMethods.cityName("Bangalore");
			desktopMethods.state("Karnataka");
			desktopMethods.zipCode("560068");
			
			
			Select countryName= new Select(driver.findElement(By.name("country")));
			countryName.selectByVisibleText("INDIA");
			
		
		  //User details 
			desktopMethods.loginEmail(emailName);
			desktopMethods.loginPassword("letmein1");
			desktopMethods.loginConfirmPassword("letmein1");
			desktopMethods.loginButton();
		
			
			//Navigating to login page and signing into the site 
			driver.navigate().to("http://newtours.demoaut.com/mercurysignon.php");			
			desktopMethods.signOffUN(emailName);
			desktopMethods.loginPassword("letmein1");
			desktopMethods.signOffClick();
			
			//Details of flight 
			desktopMethods.fromPort();
			desktopMethods.toPort();
			desktopMethods.toMonth();
			desktopMethods.findFlights();

			
			//to click random radio button
			driver.findElement(By.xpath("(//*[@name='outFlight'])[" + randomNumber1 + "]"));
			driver.findElement(By.xpath("(//*[@name='inFlight'])[" + randomNumber1 + "]"));
			desktopMethods.reserveFlights();
		
		
			//Confirm the details 
			desktopMethods.confirmFirstName(firstName);
			desktopMethods.confirmLastName(lastName);
		
		
			//Card details
			Select creditCardName= new Select(driver.findElement(By.name("creditCard")));
			creditCardName.selectByVisibleText("Visa");
		
			desktopMethods.creditCardNumber("4111111111111111");
			desktopMethods.expiryMonth();
			desktopMethods.expiryYear();
		 
			desktopMethods.ccFirstName(firstName);
			desktopMethods.ccLastName(lastName);
			desktopMethods.billAddress1("109/A, 16th main road");
			desktopMethods.billAddress2("Koramangala 4th block");
			desktopMethods.billingCity("Bangalore");
			desktopMethods.billingState("Karnataka");
			desktopMethods.billingZip("560068");
			
			Select billingCountry= new Select(driver.findElement(By.name("billCountry")));
			billingCountry.selectByVisibleText("INDIA");
			
			driver.findElement(By.xpath("//tr[14]//td[2]//input[1]")).click();
			driver.findElement(By.name("buyFlights")).click();  
	}
}
