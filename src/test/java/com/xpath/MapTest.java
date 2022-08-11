package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MapTest {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	WebElement search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
	search.sendKeys("iphone");
	WebElement button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	button.click();
	
}
}
