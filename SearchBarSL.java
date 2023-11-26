package com.SimpliLearn.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarSL {
	
	
	@FindBy(id = "header_srch")
	WebElement Searchbar;
	
	@FindBy(xpath = "//*[@id=\"homepage-search-form\"]/form/button/span")
	WebElement Searchbtn;
	
	public SearchBarSL(WebDriver driver) { 

		PageFactory.initElements(driver, this);
	}

public void HomePageSL(String search1) {
	
	Searchbar.clear();
	Searchbar.sendKeys(search1);
	
}

public void clickonSearch() {
	Searchbtn.click();
}

}
