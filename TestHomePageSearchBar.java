package com.SimpliLearn.qa.TestPages;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SimpliLearn.qa.Base.TestBaseSimpliLearn;
import com.SimpliLearn.qa.Pages.SearchBarSL;

@Listeners(ItestListenerClass.class)
public class TestHomePageSearchBar extends TestBaseSimpliLearn{
	
	
	SearchBarSL sl;
	
	@BeforeClass
	public void OpenApp() throws MalformedURLException {

	   OpenBrowser("Chrome");
		sl = new SearchBarSL(driver);
	}
	
	@Test(priority = '1', dataProvider = "testdata")
	public void searchCourse(String search1) {
		sl.HomePageSL(search1);
		sl.clickonSearch();
	}
	
	@Test
	public void pageTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
		}
	
	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws IOException {

		Object[][] input = com.SimpliLearn.qa.Utilities.Xls_DataProvider.getTestData("Sheet1");
		return input;
	}
	
	
}
