package org.sample;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainTestClass extends Functions {
	@Test(priority = 0)
	private void firstpage() {
		launch("https://adactinhotelapp.com/");
		enlarge();
		TestAutoPage1 a = new TestAutoPage1();
		WebElement username = a.getUsername();
		username.sendKeys("gopinathabinayaa");
		WebElement password = a.getPassword();
		password.sendKeys("gopinath@1993");
		WebElement login = a.getLogin();
		login.click();

	}

	@Test(priority = 1)
	private void secondPage() {
		TestAutoPage2 a1 = new TestAutoPage2();
		WebElement location = a1.getLocation();
		selectByVissibleText(location, "London");
		WebElement hotel = a1.getHotel();
		selectByVissibleText(hotel, "Hotel Creek");
		WebElement roomtype = a1.getRoomtype();
		selectByVissibleText(roomtype, "Double");
		WebElement noOfrooms = a1.getNoOfrooms();
		selectByVissibleText(noOfrooms, "2 - Two");
		WebElement adult = a1.getAdult();
		selectByVissibleText(adult, "2 - Two");
		WebElement child = a1.getChild();
		selectByVissibleText(child, "2 - Two");
		WebElement search = a1.getSearch();
		search.click();

	}

	@Test(priority = 2)
	private void thirdPage() {
		TestAutoPage3 a2 = new TestAutoPage3();
		WebElement radioBtn = a2.getRadioBtn();
		radioBtn.click();
		WebElement continuue = a2.getContinuue();
		continuue.click();

	}

	@Test(priority = 3)
	private void forthPage() {
		TestAutoPage4 a3 = new TestAutoPage4();
		WebElement firstname = a3.getFirstname();
		firstname.sendKeys("Gopinath");
		WebElement lastname = a3.getLastname();
		lastname.sendKeys("Muthukrishnan");
		WebElement address = a3.getAddress();
		address.sendKeys("Namakkal-Komarapalayam_638183");
		WebElement cardnum = a3.getCardnum();
		cardnum.sendKeys("1234567890123456");
		WebElement cardtype = a3.getCardtype();
		selectByVissibleText(cardtype, "Master Card");
		WebElement expmonth = a3.getExpmonth();
		selectByVissibleText(expmonth, "August");
		WebElement expyear = a3.getExpyear();
		selectByVissibleText(expyear, "2022");
		WebElement cvv = a3.getCvv();
		cvv.sendKeys("123");
		WebElement booknow = a3.getBooknow();
		booknow.click();

	}

}
