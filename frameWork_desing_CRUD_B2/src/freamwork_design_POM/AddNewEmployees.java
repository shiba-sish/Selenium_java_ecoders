package freamwork_design_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freamwork_design_generic.VerificationClass;

public class AddNewEmployees extends VerificationClass {
	public AddNewEmployees(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
		 }
	@FindBy(linkText = "Dashboard")
	private WebElement dashboardlink;
	
	public void clickdashboardlink() {
		dashboardlink.click();
	}
	
	@FindBy(linkText = "Test Case Template")
	private WebElement testcaselink;
	public void clicktestcaselink() {
		testcaselink.click();
	}
	@FindBy(linkText = "Logout")
	private WebElement logoutlink;
	public void clicklogoutlink() {
		logoutlink.click();
	}
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement namebox;
	public void enterName(String name) {
		namebox.sendKeys(name);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailbox;
	public void enterEmail(String email) {
		emailbox.sendKeys(email);
	}
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phonebox;
	public void enterPhone(String phone) {
		phonebox.sendKeys(phone);
	}
	
	@FindBy(xpath = "//input[@name='address']")
	private WebElement addressbox;
	public void enterAddress(String address) {
		addressbox.sendKeys(address);
	}
	
	@FindBy(xpath = "//button[@class='btn text-light m-3']")
	private WebElement addEmployeebtn;
	public void clickAddEmployeeBtn() {
		addEmployeebtn.click();
	}
	
	public void checktitle(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	public void checkurl(String expectedurl) throws IOException {
		verifyallurl(expectedurl);
	}
}
