package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayTwo {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\seleniumOct\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		String title=driver.getTitle();
		System.out.println(title);
		String current=driver.getCurrentUrl();
		System.out.println(current);
		
	
		
		WebElement clk = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
	    clk.click();
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
	    
	    
	    WebElement clk1 = driver.findElement(By.xpath("(//button[text()='Click me'])[2]"));
	    clk1.click();
	    Thread.sleep(5000);
	    Alert alt1 = driver.switchTo().alert();
	    alt1.accept();
//	    
//	    Thread.sleep(1000);
//	    WebElement clk2 = driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
//	    Thread.sleep(1000);
//	    clk2.click();
//	    Alert alt2 = driver.switchTo().alert();
//	    alt2.accept();
//	    System.out.println(clk.getText());
	    
	    
	    WebElement clc = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
	    Thread.sleep(1000);
	    clc.click();
	    clc.sendKeys("suryapavi");
	    Alert alt3 = driver.switchTo().alert();
	    alt3.accept();
	}

	}


 