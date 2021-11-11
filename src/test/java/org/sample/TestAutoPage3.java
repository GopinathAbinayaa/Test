package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAutoPage3 extends Functions {
	public TestAutoPage3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radioBtn;
	@FindBy(id = "continue")
	private WebElement continuue;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public void setRadioBtn(WebElement radioBtn) {
		this.radioBtn = radioBtn;
	}

	public WebElement getContinuue() {
		return continuue;
	}

	public void setContinuue(WebElement continuue) {
		this.continuue = continuue;
	}
}
