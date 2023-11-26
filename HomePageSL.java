package com.SimpliLearn.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSL{
	
	@FindBy(xpath = "//span[@class='courses-menu']")
	WebElement Allcourses;
	
	@FindBy(xpath = "//*[@id=\"megamenu-box\"]/ul/li[10]/a")
	WebElement Qm;
	
    @FindBy(xpath = "//*[@id=\"megamenu-box\"]/ul/li[10]/ul/li[1]/ul/li[1]/a")
    WebElement Selection ;
	
	@FindBy(xpath = "//a[@title='Course Curriculum']")
	WebElement Curriculum;
	
	//@FindBy(id = "header_srch")
	//WebElement Searchbar;
	
	//@FindBy(xpath = "//*[@id=\"homepage-search-form\"]/form/button/span")
	//WebElement Searchbtn;
	
	public HomePageSL(WebDriver driver) { 

		PageFactory.initElements(driver, this);
	}
	
	public void clickonAllcourses() {
		Allcourses.click();
	
	}
	
	public void clickonQualitymanagement() {
		Qm.click();	
		}
	
	public void clickonSelectedcourse() {
		Selection.click();;
	}
	
	//public void clickonCoursecurriculum() {
		//Curriculum.click();
   //}

}
