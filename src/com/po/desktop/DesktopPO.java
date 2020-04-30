package com.po.desktop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class DesktopPO {
	
public DesktopPO(WebDriver driver) {
	super();
	PageFactory.initElements(driver, this);
}
	@FindBy(name = "firstName")
	private WebElement firstName;
	
	@FindBy(name = "fromPort")
	private WebElement Departure;
	
	@FindBy(xpath = "//a[contains(text(),'REGISTER')]")
	private WebElement registerMember;
	
	@FindBy(name = "lastName")
	private WebElement lastName;
	
	@FindBy(name = "phone")
	private WebElement phoneNumber;
	
	@FindBy(id = "userName")
	private WebElement userName;
	
	@FindBy(name = "address1")
	private WebElement address1;
	
	@FindBy(name = "address2")
	private WebElement address2;
	
	@FindBy(name = "city")
	private WebElement cityName;
	
	@FindBy(name = "state")
	private WebElement state;
	
	@FindBy(name = "postalCode")
	private WebElement zipCode;
	
	@FindBy(id = "email")
	private WebElement loginEmail;
	
	@FindBy(name = "password")
	private WebElement loginPassword;
	
	@FindBy(name = "confirmPassword")
	private WebElement loginConfirmPassword;
	
	@FindBy(name = "register")
	private WebElement loginButton;
	
	@FindBy(name = "userName")
	private WebElement signOffUN;
	
	@FindBy(name = "login")
	private WebElement signOffClick;
	
	@FindBy(name = "fromPort")
	private WebElement fromPort;
	
	@FindBy(name = "toPort")
	private WebElement toPort;
	
	@FindBy(name = "toMonth")
	private WebElement toMonth;
	
	@FindBy(name = "findFlights")
	private WebElement findFlights;

	
	@FindBy(name = "passFirst0")
	private WebElement confirmFirstName;
	
	@FindBy(name = "passLast0")
	private WebElement confirmLastName;
	
	
	@FindBy(name = "reserveFlights")
	private WebElement reserveFlights;
	
	@FindBy(name = "creditnumber")
	private WebElement creditCardNumber;
	
	@FindBy(name = "cc_exp_dt_mn")
	private WebElement expiryMonth;
	
	
	@FindBy(name = "cc_exp_dt_yr")
	private WebElement expiryYear;
	
	@FindBy(name = "cc_frst_name")
	private WebElement ccFirstName;
	
	@FindBy(name = "cc_last_name")
	private WebElement ccLastName;
	
	
	@FindBy(name = "billAddress1")
	private WebElement billAddress1;
	
	@FindBy(name = "billAddress2")
	private WebElement billAddress2;
	
	@FindBy(name = "billCity")
	private WebElement billingCity;
	
	@FindBy(name = "billState")
	private WebElement billingState;
	
	@FindBy(name = "billZip")
	private WebElement billingZip;

	
	public void billingZip(String zip) {
		billingZip.clear();
		billingZip.sendKeys(zip);
	}
	
	public void billingState(String state) {
		billingState.clear();
		billingState.sendKeys(state);
	}

	public void billingCity(String city) {
		billingCity.clear();
		billingCity.sendKeys(city);
	}
	
	public void billAddress1(String address) {
		billAddress1.clear();
		billAddress1.sendKeys(address);
	}
	
	public void billAddress2(String address) {
		billAddress2.clear();
		billAddress2.sendKeys(address);
	}
	
	public void ccFirstName(String fname) {
		ccFirstName.clear();
		ccFirstName.sendKeys(fname);
	}
	
	public void ccLastName(String lname) {
		ccLastName.clear();
		ccLastName.sendKeys(lname);
	}
	
	public void creditCardNumber(String CCnum) {
		creditCardNumber.sendKeys(CCnum);
	}
	
	public void expiryMonth() 
	  { 
		  int p = randomNumber(0, 8);
	  selectByIndex(expiryMonth, p);
	  }
	
	 public void expiryYear() 
	  { 
		  int p = randomNumber(0, 8);
	  selectByIndex(expiryYear, p);
	  }
	
	
	public void reserveFlights () {
		reserveFlights.click();
	}
	
	
	public void confirmFirstName(String fname) {
		confirmFirstName.sendKeys(fname);
	}

	public void confirmLastName(String lname) {
		confirmLastName.sendKeys(lname);
	}
	
	
	public void findFlights() {
		findFlights.click();
	}
	
	 public void toMonth() 
	  { 
		  int p = randomNumber(6, 9);
	  selectByIndex(toMonth, p);
	  }
	
	 public void toPort() 
	  { 
		  int p = randomNumber(5, 8);
	  selectByIndex(toPort, p);
	  }
	 
	  public void fromPort() 
	  { 
		  int p = randomNumber(0, 4);
	  selectByIndex(fromPort, p);
	  }
	 

	public void signOffUN(String username) {
		signOffUN.sendKeys(username);
	}
	
	public void signOffClick() {
		signOffClick.click();
	}
	
	public void loginEmail(String mailName) {
		loginEmail.sendKeys(mailName);
	}

	public void loginPassword(String pw) {
		loginPassword.sendKeys(pw);
	}
	
	public void loginConfirmPassword(String confirmPW) {
		loginConfirmPassword.sendKeys(confirmPW);
	}

	public void loginButton() {
		loginButton.click();
	}
	
	public void address1(String address) {
		address1.sendKeys(address);
	}

	public void address2(String address) {
		address2.sendKeys(address);
	}
	
	public void cityName(String city) {
		cityName.sendKeys(city);
	}

	public void state(String stateName) {
		state.sendKeys(stateName);
	}

	public void zipCode(String zip) {
		zipCode.sendKeys(zip);
	}

	
	public void userName(String email) {
		userName.sendKeys(email);
	}

	public void phoneNumber(String phNumber) {
		phoneNumber.sendKeys(phNumber);
	}

	public void lastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void registerMember() {
		registerMember.click();
	}
	
	public void firstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	
	public static String generateRandomString() {
		String alph="";
		char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'o', 'u'};
		for(int i=0; i<5; i++)
		{
			int randomNumber= randomNumber(0, 9);
			alph= alph + c[randomNumber];
		}
		return alph;
	}
	

	public static int randomNumber(int min, int max) {
		int range = max - min + 1;
		int result = (int)(Math.random() * range) + min; 
		return result;
	}
	
	public void selectByIndex(WebElement ele, int p) {
		Select selectBox = new Select(ele);
		selectBox.selectByIndex(p);

	}
	
	
}
