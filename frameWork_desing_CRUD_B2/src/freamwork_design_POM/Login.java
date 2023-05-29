package freamwork_design_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freamwork_design_generic.VerificationClass;

public class Login extends VerificationClass {
		
		public Login(WebDriver driver){
			super(driver);
			PageFactory.initElements(driver, this);
			 }

		@FindBy(linkText = "Home")
		private WebElement homelink;
		@FindBy(linkText = "Login")
		private WebElement loginlink;
		@FindBy(linkText = "Register")
		private WebElement registerlink;
		@FindBy(linkText = "Dashboard")
		private WebElement dashboardlink;
		@FindBy(linkText = "Test Case Template")
		private WebElement testcaselink;
		@FindBy(linkText = "Logout")
		private WebElement logoutlink;
		@FindBy(xpath = "//button[@class='btn text-light']")
		private WebElement singinbtn;
		@FindBy(xpath = "//input[@id='exampleInputEmail1']")
		private WebElement usernamefield;
		@FindBy(xpath = "//input[@id='exampleInputPassword1']")
		private WebElement passwordfield;
		
	public void clickloginlink() {
		loginlink.click();
	}
	public void clickhomelink() {
		homelink.click();
	}
	public void clickregisterlink() {
		registerlink.click();
	}
	public void clickdashboardlink() {
		dashboardlink.click();
	}
	public void clicktestcaselink() {
		testcaselink.click();
	}
	public void clicklogoutlink() {
		logoutlink.click();
	}
	public void clicksinginbtn() {
		singinbtn.click();
	}
	public void enterUsername(String username) {
		usernamefield.clear();
		usernamefield.sendKeys(username);
	}
	public void enterPassword(String password) {
		passwordfield.clear();
		passwordfield.sendKeys(password);
	}
	
	public void checktitle(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	public void checkurl(String expectedurl) throws IOException {
		verifyallurl(expectedurl);
	}
	}
