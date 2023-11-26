package com.SimpliLearn.qa.TestPages;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SimpliLearn.qa.Base.TestBaseSimpliLearn;
import com.SimpliLearn.qa.Pages.HomePageSL;

@Listeners(ItestListenerClass.class)
public class TestHomePageSL extends TestBaseSimpliLearn{
	
	
	HomePageSL hp;
	
	@BeforeClass
	public void OpenApp() throws MalformedURLException {

	   OpenBrowser("Chrome");
		hp = new HomePageSL(driver);
	}
	
	@Test
	public void pageTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void HomePage() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickonAllcourses();
		Thread.sleep(2000);
		hp.clickonQualitymanagement();
		Thread.sleep(2000);
		hp.clickonSelectedcourse();
	}
	
	
}
