package org.testngframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGFramework {
	public WebDriver driver;
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("8825974058");
		WebElement txtPassword = driver.findElement(By.name("pass"));
		txtPassword.sendKeys("12345");
		WebElement btnLogIn = driver.findElement(By.name("login"));
		btnLogIn.click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Create a Story']")).isDisplayed(), "displayed!");
	}
	
	@Test
	public void tc2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail1 = driver.findElement(By.name("email"));
		txtEmail1.sendKeys("8825974058");
		WebElement txtPassword1 = driver.findElement(By.name("pass"));
		txtPassword1.sendKeys("vinith7");
		WebElement btnLogIn1 = driver.findElement(By.name("login"));
		btnLogIn1.click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Create a Story']")).isDisplayed(), "displayed!");
		//so.assertAll();
	}
}
