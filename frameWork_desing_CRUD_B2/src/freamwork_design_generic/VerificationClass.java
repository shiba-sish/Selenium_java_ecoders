package freamwork_design_generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

public class VerificationClass {
	public WebDriver driver;
	
	 public VerificationClass(WebDriver driver){
		this.driver= driver; 
	 }
public void verifyalltitles(String specificpagetitle) throws IOException {
	LocalDateTime time = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formatedatetime = time.format(format);
	String timestamp = formatedatetime.toString().replace(":", "-");
	try {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains(specificpagetitle));
	Reporter.log("Title Match Successfully!!!",true);
	}
	catch (Exception e) {
	e.printStackTrace();
	TakesScreenshot ts= (TakesScreenshot)driver;
	File romlocation=ts.getScreenshotAs(OutputType.FILE);
	File harddisk = new File("C:\\Users\\Shibasish China\\eclipse-workspace\\freamwork_design\\failed_screetshorts\\failed_ss"+timestamp+".jpeg");
	Files.copy(romlocation,harddisk);
	}
}
public void verifyallurl(String specificpageurl) throws IOException {
	LocalDateTime time = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formatedatetime = time.format(format);
	String timestamp = formatedatetime.toString().replace(":", "-");
	try {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlToBe(specificpageurl));
	Reporter.log("URL Match Successfully!!!",true);
	}
	catch (Exception e) {
	e.printStackTrace();
	TakesScreenshot ts= (TakesScreenshot)driver;
	File romlocation=ts.getScreenshotAs(OutputType.FILE);
	File harddisk = new File("C:\\Users\\Shibasish China\\eclipse-workspace\\freamwork_design\\failed_screetshorts\\failed_ss"+timestamp+".jpeg");
	Files.copy(romlocation,harddisk);
	}
}
}
