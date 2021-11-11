package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functions {

	static WebDriver driver;

	public String bookingId(WebElement element) {
		return element.getAttribute("value");

	}

	public WebElement radioBtn(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement find(String data) {
		return driver.findElement(By.id(data));
	}

	public WebElement findd(String data) {
		return driver.findElement(By.xpath(data));
	}

	public WebElement search(String data) {
		return driver.findElement(By.id(data));
	}

	public WebElement bookNow(String data) {
		return driver.findElement(By.id(data));
	}

	public WebElement contiinue(String data) {
		return driver.findElement(By.id(data));
	}

	public void selectByVissibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);

	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public WebElement btnLogin(String data) {
		return driver.findElement(By.xpath(data));
	}

	public WebElement locationn(String data) {
		return driver.findElement(By.id(data));
	}

	public WebElement userName(String data) {
		return driver.findElement(By.xpath(data));
	}

	public WebElement password(String data) {
		return driver.findElement(By.xpath(data));
	}

	public static void launch(String data) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(data);
	}

	public static void enlarge() {
		driver.manage().window().maximize();

	}

	public WebElement firstName(String data) {
		return driver.findElement(By.xpath(data));

	}

	public void keys(WebElement element, String data) {
		element.sendKeys(data);

	}

	public WebElement lastName(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement address(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement wmailAddress(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement phone(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement gender(String data) {
		return driver.findElement(By.xpath(data));

	}

	public void click(WebElement element) {
		element.click();

	}

	public WebElement box1(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement box2(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement box3(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement language(String data) {
		return driver.findElement(By.xpath(data));

	}

	public WebElement selectLanguage(String data) {
		WebElement dDn = driver.findElement(By.xpath(data));
		Select select = new Select(dDn);
		select.selectByVisibleText("+data+");
		return dDn;

	}

	public void excelDataOut(String sheetName, int rowNum, int cellNum, String data) throws IOException {
		File file = new File("C:\\\\Users\\\\USER\\\\eclipse-workspace\\\\MavenSample\\\\Excel\\\\adaction hotel.xlsx");
		FileInputStream in = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(in);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell createCell = row.createCell(cellNum);
		createCell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	public String excelDatas(String sheetName, int rowNum, int cellNum) throws IOException {

		String data = null;
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\MavenSample\\Excel\\adaction hotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int type = cell.getCellType();
		if (type == 1) {
			data = cell.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mmm-yy");
				data = dateFormat.format(date);

			} else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				data = String.valueOf(l);
			}
		}

		return data;
	}

}
