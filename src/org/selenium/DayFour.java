package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayFour {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\seleniumOct\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		WebElement tbody = driver.findElement(By.xpath("(//tbody)[2]"));	    	
		
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			
			WebElement row = trows.get(i);
		List<WebElement> tdata = row.findElements(By.tagName("td"));
		
		WebElement name  = tdata.get(0); 
		String current = name.getText();
		
		if (current.contains("Apollo")) {
			WebElement data  = tdata.get(2);  
			String text = data.getText();
			System.out.println("Apollo Hospitals->"+text);
		}else {
			System.out.println("Apollo is not defined->"+current);
		}
		}
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Records//report.png");
		FileUtils.copyFile(source, dest);
		
}
}