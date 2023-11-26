package com.SimpliLearn.qa.Base;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestBaseSimpliLearn {
	
	public static WebDriver driver;
	public static ExtentReports extentreports;
	public static ExtentTest extentTest;
	
public void OpenBrowser(String Browser) throws MalformedURLException {
	
	//ChromeOptions cap = new ChromeOptions();
	
	driver = new ChromeDriver();
    //driver =  new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"),cap);
	driver.manage().window().maximize();
	driver.get("https://www.simplilearn.com/");
}

@BeforeTest
public void getnameMethod(ITestContext context) {
	
	extentTest = extentreports.createTest(context.getName());
}

@BeforeSuite
public void InitalizeExtentReport() {
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("SimpliLearn_user_report.html");
		extentreports = new ExtentReports();
		extentreports.attachReporter(sparkreporter);
		
		extentreports.setSystemInfo("OS", System.getProperty("os.name"));
		extentreports.setSystemInfo("JAVA", System.getProperty("java.version"));	
}

@AfterSuite
public void generateReports() throws IOException {
	extentreports.flush();
	Desktop.getDesktop().browse(new File("SimpliLearn_user_report.html").toURI());
}

@AfterMethod
public void generateTestStatus(Method m, ITestResult result) {
	if (result.getStatus() == ITestResult.FAILURE) {
		System.out.println("Capture Screenshot");
		extentTest.fail(result.getThrowable());
	} else if (result.getStatus() == ITestResult.SUCCESS) {
		extentTest.pass(m.getName() + " is passed");
	}
}
}
