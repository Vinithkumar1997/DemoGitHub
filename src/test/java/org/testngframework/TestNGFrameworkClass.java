package org.testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGFrameworkClass {
	public WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
//	@AfterClass
//	public void closeBrowser() {
//		driver.quit();
//	}
	@Test
	public void tc1() throws InterruptedException {
		driver.get("http://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("8825974058");
		String attribute = txtEmail.getAttribute("value");
		Assert.assertEquals(attribute, "8825974058", "Check username");
		WebElement txtPassword = driver.findElement(By.name("pass"));
		txtPassword.sendKeys("vinith7");
		WebElement btnLogIn = driver.findElement(By.name("login"));
		btnLogIn.click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("privacy_mutation_token"),
				"Check the login process");
	}
	@Test
	public void tc2() throws InterruptedException {
		driver.get("http://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("8825974058");
		String attribute = txtEmail.getAttribute("value");
		Assert.assertEquals(attribute, "8825974058", "Check username");
		WebElement txtPassword = driver.findElement(By.name("pass"));
		txtPassword.sendKeys("vinith7");
		WebElement btnLogIn = driver.findElement(By.name("login"));
		btnLogIn.click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("privacy_mutation_token"),
				"Check the login process");
	}
}
