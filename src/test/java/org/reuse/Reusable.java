package org.reuse;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.sample.Functions;

public class Reusable extends Functions {
	@BeforeClass
	public static void rbowserFun() {
		launch("https://adactinhotelapp.com/");
		enlarge();
	}

	@Test
	public void websiteDatas() throws IOException, InterruptedException {
		WebElement txtUserName = find("username");
		keys(txtUserName, excelDatas("Sheet1", 1, 0));
		WebElement txtPassword = find("password");
		keys(txtPassword, excelDatas("Sheet1", 1, 1));
		WebElement btnLogin = find("login");
		click(btnLogin);
		WebElement location = find("location");
		selectByVissibleText(location, excelDatas("Sheet1", 1, 2));
		WebElement hotels = find("hotels");
		selectByVissibleText(hotels, excelDatas("Sheet1", 1, 3));
		WebElement room = find("room_type");
		selectByVissibleText(room, excelDatas("Sheet1", 1, 4));
		WebElement noRooms = find("room_nos");
		selectByVissibleText(noRooms, excelDatas("Sheet1", 1, 5));
		WebElement adult = find("adult_room");
		selectByVissibleText(adult, excelDatas("Sheet1", 1, 8));
		WebElement child = find("child_room");
		selectByVissibleText(child, excelDatas("Sheet1", 1, 9));
		WebElement search = find("Submit");
		click(search);
		WebElement radioBtn = radioBtn("//input[@id='radiobutton_0']");
		click(radioBtn);
		WebElement continne = find("continue");
		click(continne);
		WebElement firstName = find("first_name");
		keys(firstName, excelDatas("Sheet1", 1, 10));
		WebElement lastName = find("last_name");
		keys(lastName, excelDatas("Sheet1", 1, 11));
		WebElement address = find("address");
		keys(address, excelDatas("Sheet1", 4, 0));
		WebElement creditCrdNum = findd("//input[@id='cc_num']");
		keys(creditCrdNum, excelDatas("Sheet1", 4, 1));
		WebElement cardType = find("cc_type");
		selectByVissibleText(cardType, excelDatas("Sheet1", 4, 2));
		WebElement expMonth = find("cc_exp_month");
		selectByVissibleText(expMonth, excelDatas("Sheet1", 4, 3));
		WebElement expYer = find("cc_exp_year");
		selectByVissibleText(expYer, excelDatas("Sheet1", 4, 4));
		WebElement cvvNum = find("cc_cvv");
		keys(cvvNum, excelDatas("Sheet1", 4, 5));
		WebElement bookNow = find("book_now");
		click(bookNow);
		Thread.sleep(5000);
		WebElement bookingId = find("order_no");
		String id = bookingId(bookingId);
		excelDataOut("Sheet1", 4, 6, id);

	}

}
