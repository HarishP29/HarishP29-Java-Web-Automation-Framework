package products;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import executionPack.Execution;

public class SunGlasses extends OpenBrowser {
	Logger log = Logger.getLogger(SunGlasses.class);
	
	public void womensGlasses() throws InterruptedException {
		log.info("WomensGlasses");
		extentTest =extentReport.createTest("WomenGlasses");
		Actions a=new Actions(driver);
		WebElement sunglasses=driver.findElement(By.xpath(a1.get(13)));
		a.moveToElement(sunglasses).build().perform();
		driver.findElement(By.xpath(a1.get(14))).click();
		driver.findElement(By.xpath(a1.get(15))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public void mensGlasses() throws InterruptedException {
		log.info("MensGlasses");
		extentTest =extentReport.createTest("MensGlasses");
		Actions a=new Actions(driver);
		WebElement sunglasses=driver.findElement(By.xpath(a1.get(13)));
		a.moveToElement(sunglasses).build().perform();
		driver.findElement(By.xpath(a1.get(17))).click();
		driver.findElement(By.xpath(a1.get(18))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public void kidsGlasses() throws InterruptedException {
		log.info("KidsGlasses");
		extentTest =extentReport.createTest("KidsGlasses");
		Actions a=new Actions(driver);
		WebElement sunglasses=driver.findElement(By.xpath(a1.get(13)));
		a.moveToElement(sunglasses).build().perform();
		driver.findElement(By.xpath(a1.get(20))).click();
		driver.findElement(By.xpath(a1.get(21))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
}
