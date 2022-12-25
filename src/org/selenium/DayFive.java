package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DayFive {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\seleniumOct\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement create = driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
		create.click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		List<WebElement> L = s.getOptions();
		for (WebElement surya : L) {
			System.out.println(surya.getText());
			if (surya.getText().equals(14)) {		
			}
		}
		
		WebElement Month = driver.findElement(By.id("month"));
		Select s1 = new Select(Month);
		s1.selectByIndex(9);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByIndex(22);
		
       Actions a = new Actions(driver);
		
		
		}

	}




 