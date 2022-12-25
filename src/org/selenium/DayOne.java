package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayOne {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\seleniumOct\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		String current=driver.getCurrentUrl();
		System.out.println(current);
		
		Actions a = new Actions(driver);
		
		WebElement user = driver.findElement(By.id("email"));
		a.sendKeys( user, "suryapavi").build().perform();
		
		WebElement pass = driver.findElement(By.id("pass"));
		a.sendKeys(pass, "12345").build().perform();
		
		WebElement log = driver.findElement(By.xpath("//button[text()='Log in']"));
		a.click(log).build().perform();
		Thread.sleep(1000);
		WebElement  fb = driver.findElement(By.xpath("//span[contains(text(),'Log in ')]"));
		a.doubleClick(fb).build().perform();
		
		a.contextClick(fb).build().perform();
		
		Robot r = new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		WebElement mail = driver.findElement(By.id("email_container"));
		a.doubleClick(mail).build().perform();
		a.contextClick(mail).build().perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER); 
		
		WebElement fp = driver.findElement(By.xpath("  //a[text()='Forgotten password?']"));
		a.moveToElement(fp).build().perform();
	}
	
	

	}


 