package freamwork_design_scripts_System_Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.AddNewEmployees;
import freamwork_design_POM.Dashboard;
import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;
//this class will add employee
public class Add_Employee extends OpenCloseClass{
	@Test
	public void addEmployee() throws InterruptedException, IOException {
		//open home page 
		Home homepage= new Home(driver);
		// open login page 
		homepage.clickloginlink();
		//login page
		Login l = new Login(driver);
		//entering username and password in login page
		l.enterUsername("s1hi0b1a874q@gmail.com");
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
		//click AddEmployee link
		d.clickAddEmployeelink();
		// fill the details of an employee
		AddNewEmployees ane = new AddNewEmployees(driver);
		ane.enterName("Shibasish");
		ane.enterEmail("shiba000@gmail.com");
		ane.enterPhone("1234567000");
		ane.enterAddress("pune");
		ane.clickAddEmployeeBtn();
		//verify title and url of dashboard page
		String expectedtitle2 = Reading_Data.getdata("Sheet1", 3, 0);
		String expectedurl2 = Reading_Data.getdata("Sheet1", 3, 1);
		Thread.sleep(1000);
		d.checktitle(expectedtitle2);
		d.checkurl(expectedurl2);

	}
}
