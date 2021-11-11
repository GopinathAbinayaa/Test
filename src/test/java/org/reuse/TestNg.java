package org.reuse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	WebDriver driver;

	@BeforeClass

	private void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();
	}

	@Parameters({ "username", "password" })
	@Test(priority = 0)
	private void datas(String user, String pass) {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys(user);
		password.sendKeys(pass);
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

	@Parameters({ "location", "hotels", "roomType", "noOfRoom", "adults", "childs" })
	@Test(priority = 1)
	private void page2(String locationn, String hotelss, String roomm, String roomss, String adultss, String childss) {
		WebElement loc = driver.findElement(By.id("location"));
		Select select = new Select(loc);
		select.selectByVisibleText(locationn);
		WebElement hot = driver.findElement(By.id("hotels"));
		Select select2 = new Select(hot);
		select2.selectByVisibleText(hotelss);
		WebElement rooom = driver.findElement(By.id("room_type"));
		Select select3 = new Select(rooom);
		select3.selectByVisibleText(roomm);
		WebElement noorooms = driver.findElement(By.id("room_nos"));
		Select select4 = new Select(noorooms);
		select4.selectByVisibleText(roomss);
		WebElement aadult = driver.findElement(By.id("adult_room"));
		Select select5 = new Select(aadult);
		select5.selectByVisibleText(adultss);
		WebElement cchild = driver.findElement(By.id("child_room"));
		Select select6 = new Select(cchild);
		select6.selectByVisibleText(childss);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

	}

	@Test(priority = 2)
	private void radiocontinue() {
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		radioBtn.click();
		WebElement ccontinue = driver.findElement(By.id("continue"));
		ccontinue.click();

	}

	@Parameters({ "firstName", "lastName", "address", "crdNum", "crdType", "expMnth", "expYear", "cvv" })
	@Test(priority = 3)
	private void page3(String first, String last, String add, String crdnum, String ctype, String ma, String var,
			String ccvv) {
		WebElement fst = driver.findElement(By.id("first_name"));
		fst.sendKeys(first);
		WebElement lst = driver.findElement(By.xpath("//input[@name='last_name']"));
		lst.sendKeys(last);
		WebElement aadd = driver.findElement(By.xpath("//textarea[@name='address']"));
		aadd.sendKeys(add);
		WebElement crdNum = driver.findElement(By.xpath("//input[@id='cc_num']"));
		crdNum.sendKeys(crdnum);
		WebElement type = driver.findElement(By.id("cc_type"));
		Select select = new Select(type);
		select.selectByVisibleText(ctype);
		WebElement mmnth = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(mmnth);
		select7.selectByVisibleText(ma);
		WebElement v = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(v);
		select8.selectByVisibleText(var);
		WebElement c = driver.findElement(By.id("cc_cvv"));
		c.sendKeys(ccvv);
		WebElement bk = driver.findElement(By.id("book_now"));
		bk.click();

	}
}
