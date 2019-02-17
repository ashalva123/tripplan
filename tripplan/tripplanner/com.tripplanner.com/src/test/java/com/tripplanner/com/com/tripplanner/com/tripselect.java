package com.tripplanner.com.com.tripplanner.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tripselect {

	WebDriver driver;



public tripselect(WebDriver driver)
	
	{
		this.driver=driver;
		
	}
	

	By fromloc=By.xpath("//label[contains(text(),'From')]//following::input[1]");
	
	By to = By.xpath("//label[contains(text(),'To')]//following::input[1]");
	
	By submit = By.xpath("//*[@class='btn btn-primary go-btn']");



		public void searchfrom(String startingloc)
		{
		
		driver.findElement(fromloc).sendKeys(startingloc);
		
		List <WebElement> list = driver.findElements(By.xpath("//div[@class='autosuggest-container']//div[@class='list-group-item-title']"));
		
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
			{
			
				System.out.println(list.get(i).getText());
			
				if(list.get(i).getText().contains(startingloc))
				{
				list.get(i).click();
		
		break;
				}
			
			}   
		
		}
		
		
		
		public void searchto(String destination)
		{
		
		driver.findElement(to).sendKeys(destination);
		
		List <WebElement> list1 = driver.findElements(By.xpath("//div[@class='autosuggest-container']//div[@class='list-group-item-title']"));
		
		
		
		System.out.println(list1.size());
		
		for(int i=0;i<list1.size();i++)
			{
			
				System.out.println(list1.get(i).getText());
			
				if(list1.get(i).getText().contains(destination))
				{
				list1.get(i).click();
		
			break;
				}
			
			}  
		
		}
		
		
		
		public void submit()
		{
			
		driver.findElement(submit).click();
		
		}

}
