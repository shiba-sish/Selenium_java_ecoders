package freamwork_design_scripts_System_Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Dashboard;
import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_POM.Register;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Registration_login_logout extends OpenCloseClass {
	//this class will open application do registration and login and logout and verify each and every page title and url
	
	@Test
public void registration_login() throws IOException, InterruptedException {
		//open home page 
	Home homepage= new Home(driver);
	// open registration page 
	homepage.clickregisterlink();
	Register rg= new Register(driver);
	//enter user name
	rg.enterUsername("s1hib@gmail.com");
	Thread.sleep(1000);
	// enter password
	rg.enterPassword("12698676418");
	Thread.sleep(1000);
	//click  register btn
	rg.clickregisterbtn();
	Thread.sleep(1000);
	//verification of  title and url of login page
	String expectedtitle = Reading_Data.getdata("Sheet1", 1, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 1, 1);
	Thread.sleep(1000);
	//login page
	Login l = new Login(driver);
	//entering username and password in login page
	l.enterUsername("s1hib@gmail.com");
	l.enterPassword("12698676418");
	l.clicksinginbtn();
	//dashboard page
	Dashboard d= new Dashboard(driver);
	//verify title and url of dashboard page
	String expectedtitle1 = Reading_Data.getdata("Sheet1", 3, 0);
	String expectedurl1 = Reading_Data.getdata("Sheet1", 3, 1);
	Thread.sleep(1000);
	d.checktitle(expectedtitle1);
	d.checkurl(expectedurl1);
	//username is showing or not
	boolean verifyuser = d.checkusername("s1hib@gmail.com");
	System.out.println("username matched: "+verifyuser);
	//clicking logout btn
	d.clicklogoutlink();
	//verifying home page url and title
	String expectedtitle2 = Reading_Data.getdata("Sheet1", 0, 0);
	String expectedurl2 = Reading_Data.getdata("Sheet1", 0, 1);
	homepage.checktitle(expectedtitle2);
	homepage.checkurl(expectedurl2);
	
}
}
