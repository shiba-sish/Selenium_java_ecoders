package freamwork_design_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freamwork_design_generic.VerificationClass;

public class Dashboard extends VerificationClass {
	
	public Dashboard(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
		 }
	
	
	@FindBy(linkText = "Test Case Template")
	private WebElement testcaselink;
	@FindBy(linkText = "Logout")
	private WebElement logoutlink;
	//addEmployee page
	@FindBy(xpath = "//a[@class='nav-link active']")
	private WebElement addEmployeeLink;
	//user id name
	@FindBy(xpath = "//i[contains(text(),'User')]")
	private WebElement userid;
	

public void clicktestcaselink() {
	testcaselink.click();
}
public void clicklogoutlink() {
	logoutlink.click();
}
public void clickAddEmployeelink() {
	addEmployeeLink.click();
}
public boolean checkusername(String username) {
	String userId = userid.getText();
	if(userId.contains(username)) {
		return true;
	}
	else {
		return false;
	}
}
public void checktitle(String expectedtitle) throws IOException {
	verifyalltitles(expectedtitle);
}
public void checkurl(String expectedurl) throws IOException {
	verifyallurl(expectedurl);
}
}

