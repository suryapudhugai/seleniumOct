package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayThree {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\seleniumOct\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		String current=driver.getCurrentUrl();
		System.out.println(current);
		
		driver.manage().window().maximize();
		
		WebElement clc = driver.findElement(By.xpath("//button[text()='✕']"));
		clc.click();

		WebElement cla = driver.findElement(By.name("q"));
		cla.sendKeys("i phone");
		
		WebElement ok = driver.findElement(By.xpath("//button[@type='submit']"));
	    ok.click();
	    
	    Thread.sleep(1000);
	    WebElement ok1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']"));
	    ok1.click();
	    
	    String parent = driver.getWindowHandle();
	    
	    Set<String> child = driver.getWindowHandles();
	    for (String url : child) {
			if(!url.equals(parent)) {
			driver.switchTo().window(url);
		}
	 }  
	    WebElement ok2 = driver.findElement(By.xpath("//div[@class='dyC4hf']"));
	    System.out.println(ok2.getText());
	    Thread.sleep(1000);
	    driver.close();
	}
	
	

	}


 