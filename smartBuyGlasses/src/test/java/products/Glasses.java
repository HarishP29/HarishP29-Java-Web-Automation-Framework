package products;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import executionPack.Execution;

public class Glasses extends OpenBrowser {
	Logger log = Logger.getLogger(Glasses.class);
	public void womensGlasses() throws InterruptedException {
		log.info("WomensGlasses");
		extentTest =extentReport.createTest("WomensGlasses");
		Actions a=new Actions(driver);
		WebElement glasses=driver.findElement(By.xpath(a1.get(3)));
		a.moveToElement(glasses).build().perform();
		driver.findElement(By.xpath(a1.get(4))).click();
		driver.findElement(By.xpath(a1.get(5))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public void mensGlasses() throws InterruptedException {
		log.info("MensGlasses");
		extentTest =extentReport.createTest("MensGlasses");
		Actions a=new Actions(driver);
		WebElement glasses=driver.findElement(By.xpath(a1.get(3)));
		a.moveToElement(glasses).build().perform();
		driver.findElement(By.xpath(a1.get(7))).click();
		driver.findElement(By.xpath(a1.get(8))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public void kidsGlasses() throws InterruptedException {
		log.info("KidsGlasses");
		extentTest =extentReport.createTest("KidsGlasses");
		Actions a=new Actions(driver);
		WebElement glasses=driver.findElement(By.xpath(a1.get(3)));
		a.moveToElement(glasses).build().perform();
		driver.findElement(By.xpath(a1.get(10))).click();
		driver.findElement(By.xpath(a1.get(11))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
}
	

	


