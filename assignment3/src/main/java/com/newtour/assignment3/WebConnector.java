package com.newtour.assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebConnector {
	WebDriver driver;
	public Properties prop;
	FirefoxOptions options = new FirefoxOptions();

	public WebConnector() throws IOException {
		if (prop == null) {

			try {
				prop = new Properties();
				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\project.properties");
				prop.load(fs);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}
	}

	public void openBrowser(String browserName) {

		if (browserName.equals("Mozilla")) {
			options.setBinary("C:\\Users\\M1019117\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver(options);
		} else if (browserName.equals("Chrome"))
			driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public void navigate(String urlKey) {
		driver.get(prop.getProperty(urlKey));
	}

	public void click(String objectKey) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty(objectKey)));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		Thread.sleep(500);

	}

	public void type(String objectKey, String data) {
		WebElement text = driver.findElement(By.xpath(prop.getProperty(objectKey)));
		text.sendKeys(data);
		text.sendKeys(Keys.ENTER);

	}

	public WebElement getObject(String objectKey) {
		WebElement e = null;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			if (objectKey.endsWith("_xpath")) {
				e = driver.findElement(By.xpath(prop.getProperty(objectKey)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty(objectKey))));
			} else if (objectKey.endsWith("_id")) {
				e = driver.findElement(By.id(prop.getProperty(objectKey)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty(objectKey))));
			} else if (objectKey.endsWith("_name")) {
				e = driver.findElement(By.name(prop.getProperty(objectKey)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(prop.getProperty(objectKey))));
			} else if (objectKey.endsWith("css")) {
				e = driver.findElement(By.cssSelector(prop.getProperty(objectKey)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(prop.getProperty(objectKey))));
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return e;
	}

	public boolean isElementPresent(String objectKey) {
		List<WebElement> e = null;
		if (objectKey.endsWith("_xpath")) {
			e = driver.findElements(By.xpath(prop.getProperty(objectKey)));
		} else if (objectKey.endsWith("_id")) {
			e = driver.findElements(By.id(prop.getProperty(objectKey)));
		} else if (objectKey.endsWith("_name")) {
			e = driver.findElements(By.name(prop.getProperty(objectKey)));
		} else if (objectKey.endsWith("css")) {
			e = driver.findElements(By.cssSelector(prop.getProperty(objectKey)));

		}
		if (e.size() == 0)
			return false;
		else
			return true;

	}

}
