package com.tcs.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Iswarya\\Desktop\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://leafground.com/window.xhtml;jsessionid=node01kxx478dvfdi3voq5vccrmlst84864.node0");
	    String string= driver.getWindowHandle();
        WebElement open =driver.findElement(By.xpath("//*[text()='Open']"));
        open.click();  
      driver.close();
	
}
}
