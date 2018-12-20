package com.ibm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminPage{
	WebDriver driver;
	WebDriverWait wait;
   @FindBy(xpath="//*[@id='side-menu']/li[6]/a")
   WebElement systemEle;
   @FindBy(xpath="//*[@id='side-menu']/li[6]/ul/li[1]/a")
   WebElement settingsEle;
   @FindBy(xpath="//input[@id='store_name']")
   WebElement storeNameEle;
   @FindBy(xpath="//*[@id='page-wrapper']/div/div[1]/div/ol/li[1]/button")
   WebElement saveEle;
   @FindBy(xpath="//*[@id='wrapper']/nav/div[2]/ul/li/a")
   WebElement logOutEle;
   public AdminPage(WebDriver driver,WebDriverWait wait)
   {
	   PageFactory.initElements(driver, this);
	   this.driver=driver;
	   this.wait=wait;
   }
   public void clickOnSystem()
   {
	   systemEle.click();
   }
  public void clickOnSettings()
  {
	  settingsEle.click();
  }
  public void clearStoreName()
  {
	  storeNameEle.clear();
  }
  public void inputStoreName(String strname)
  {
	  storeNameEle.sendKeys(strname);
  }
  public void clickOnSave()
  {
	  saveEle.click(); 
  }
  public void verifyChangedStoreName(String chngstorename)
  {
	  Assert.assertTrue(storeNameEle.getAttribute("value").equals(chngstorename));
  }
  public void clickOnLogOut()
  {
	  logOutEle.click();
  }
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
