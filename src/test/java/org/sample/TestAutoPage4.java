package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAutoPage4 extends Functions {
	public TestAutoPage4() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardnum;
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
}
