package org.reuse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class Junit {
	static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		boolean ad = currentUrl.contains("ad");
		Assert.assertTrue("verify url", ad);
	}

	@Test
	public void datas() {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("gopinathabinayaa");
		String crtUser = txtUser.getAttribute("value");
		Assert.assertEquals("verify user Name", "gopinathabinayaa", crtUser);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Gopinath@1993");
		String pass = txtPass.getAttribute("value");
		Assert.assertEquals("verify passord", "gopinath@1993", pass);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

	@AfterClass
	public static void afterTask() {
		driver.close();

	}

}
