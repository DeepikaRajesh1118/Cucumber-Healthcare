package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassHealth {

	public static WebDriver driver;

	//1
	public static void browserLaunch() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    
	//2
	public static void urlWebsite(String url) {
		driver.get(url);
	}

    //3	// click
	public static void click(WebElement clickobject) {
		clickobject.click();
	}

	//4 // sendkeys
	public static void sendTxt(WebElement text, String txt) {
		text.sendKeys(txt);
	}

    //5	// minimize
	public static void browserMinimize() {
		Dimension d = new Dimension(480, 620);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}

    //6	// submit
	public static void submitted(WebElement submi) {
		submi.submit();
	}
	
    //7
 	public static void browserMaximize() {
		// Point p = new Point(300,550);
		// Resize the current window to the given dimension
		// driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
	}

	public static String getAttribute(WebElement att, String text) {
		String storeAtt = att.getAttribute(text);
		System.out.println(storeAtt);
		return storeAtt;
	}

	//8 Actions move to element
	public static void actionsMethod(WebElement move) {
		Actions a = new Actions(driver);
		a.moveToElement(move).perform();
	}

	//9 Actions click
	public static void actionsClick(WebElement actClick) {
		Actions a = new Actions(driver);
		a.click(actClick).perform();
	}

	//10 moveto element click
	public static void actionMoveClick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click(element).perform();
	}

	//11 datadriven method
	public static String readExcel(int rownum, int cellnum) throws IOException {
		File f = new File(
				"C:\\Users\\Deepika.LAPTOP-55ACCVSQ\\eclipse-workspace\\HealthCareProject\\target\\Excel\\cucuExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet s = book.getSheet("sheet1");
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		// org.apache.poi.ss.usermodel.Cell.getCellType();
		int cellType = c.getCellType();
		String value = null;
		if (cellType == 1) {
			value = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			java.util.Date date = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			value = sdf.format(date);

		} else {
			double num = c.getNumericCellValue();
			long l = (long) num;
			value = String.valueOf(l);
		}
		return value;
	}

	//12 javasecript Executor
	public static void highlightStyle(WebElement box) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0],setAttribute('style','background :yellow')",
		// box);
		js.executeScript("arguments[0].style.backgroundColor='yellow'", box);

		js.executeScript("arguments[0].style.border='5px solid red'", box);

	}
    //19 javascript click
	public static void clickElementJs(WebElement clickElement, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clickElement);

	}

	//20 close
	public static void close() {
		driver.close();
	}

	//21 refresh
	public static void refresh() {
		driver.navigate().refresh();
	}

	//22 forward
	public static void forwordNavigate() {
		driver.navigate().forward();
	}

	//23 back
	public static void backNavigate() {
		driver.navigate().back();
	}

	//24 alert
	public static void alertMessage(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}

	//25 screenshot
	public static void saveScreenShot(String desPath) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(desPath);
		FileUtils.copyFile(src, des);
	}

	//26 actions right click
	public static void rightClickAndPerform(WebElement ele, int position) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).contextClick(ele).build().perform();
		try {
			Robot r = new Robot();
			for (int i = 1; i <= position; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	//27 Actions Enter using Robot class
	public static void keyEnter(WebElement click) throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 28.Actions using text Double_click and robot class
	public static void textDoubleClick_Enter(WebElement click) throws AWTException, InterruptedException {
		Actions a = new Actions(driver);
		a.doubleClick(click).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
     
	//29  doubleclick robot copy
	public static void copyValue(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	
	//30 paste using robot class
	public static void pasteValue(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	//31 scrollToValueAtTop
	public static void scrollToValueAtTop(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
	}
    
	//32 scrollToValueAtBottom
	public static void scrollToValueAtBottom(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
 
	//33 acceptAlert
	public static void acceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	//34 dismissAlert
	public static void dismissAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	//35
	public static void sendValuesToAlert(String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
		a.accept();
	}
	//36 getAlertText
	public static void getAlertText(String value) {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println("Alert Text : " + text);
	}
	//37 dropdownSelectByValue
	public static void dropdownSelectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	//38 dropdownSelectByIndex
	public static void dropdownSelectByIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
	}
	//39 dropdownSelectByVisibleText
	public static void dropdownSelectByVisibleText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	//40
	public static void dropdownDeSelectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.deselectByValue(value);
	}
	//41
	public static void dropdownDeSelectByIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.deselectByIndex(index);
	}
	//42
	public static void dropdownDeSelectByVisibleText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.deselectByVisibleText(text);
	}
	//43 checkMultiSelectDropdown
	public static void checkMultiSelectDropdown(WebElement ele) {
		Select s = new Select(ele);
		boolean isMulti = s.isMultiple();
		System.out.println("Multi Select Drop : " + isMulti);
	}
	//44 getDropdownOptions
	public static void getDropdownOptions(WebElement ele) {
		Select s = new Select(ele);
		System.out.println("Dropdown Options");
		List<WebElement> li = s.getOptions();
		for (WebElement e : li) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	//45
	public static void getDropdownSelectedOptions(WebElement ele) {
		Select s = new Select(ele);
		System.out.println("All Selected Options");
		List<WebElement> li = s.getAllSelectedOptions();
		for (WebElement e : li) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	
	//46 sendCapsValue
	public static void sendCapsValue(WebElement ele, String value) {
		Actions a = new Actions(driver);
		a.keyDown(ele, Keys.SHIFT).sendKeys(value).keyUp(Keys.SHIFT).build().perform();
	}
	//47
	public static void doubleAndRightClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).contextClick(ele).build().perform();
	}
	//48
	public static void firstSelectedDropdownOption(WebElement ele) {
		Select s = new Select(ele);
		System.out.println("First Selected Option");
		WebElement first = s.getFirstSelectedOption();
		String text = first.getText();
		System.out.println(text);
	}
	//49
	public static void gotoFrameByNameOrId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	//50
	public static void gotoFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	//51
	public static void gotoFrameByElement(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	//52
	public static void gotoParentFrame() {
		driver.switchTo().parentFrame();
	}
	//53
	public static void gotoMainHtml() {
		driver.switchTo().defaultContent();
	}
	//54
	public static void waitUntilTitleContains(Duration sec, String title, String frameId) {
		WebDriverWait w = new WebDriverWait(driver, sec);
		w.until(ExpectedConditions.titleContains(title));
		driver.switchTo().frame(frameId);
	}
	//55
	public static void writeData(String filePath, String sheetName, int rowNo, int cellNo, String error)
			throws IOException {
		File f = new File(filePath);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(error);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	}
	//56
	public static void moveToElementAndPrint(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		String text = ele.getText();
		System.out.println("Text Value : " + text);
	}
	
	public static void quit() {
		driver.quit();
	}
	

	}

