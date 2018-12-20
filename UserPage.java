package com.ibm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserPage 
{
	
WebDriver driver;
WebDriverWait wait;
@FindBy(xpath="//p[@class='wellcome-to anima']")
WebElement storeNameVerify;
public UserPage(WebDriver driver,WebDriverWait wait)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
	this.wait=wait;
}
public void storeNameVerification(String str)
{
	Assert.assertTrue(storeNameVerify.getText().trim().equals(str));
}

}
