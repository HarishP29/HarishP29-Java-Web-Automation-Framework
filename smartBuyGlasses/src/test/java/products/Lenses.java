package products;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Lenses extends OpenBrowser {
	Logger log = Logger.getLogger(Lenses.class);
	public void svGlasses() throws InterruptedException {
		log.info("SV");
		extentTest =extentReport.createTest("SVGlasses");
		Actions a=new Actions(driver);
		WebElement lenses=driver.findElement(By.xpath(a1.get(23)));
		a.moveToElement(lenses).build().perform();
		driver.findElement(By.xpath(a1.get(24))).click();
		driver.findElement(By.xpath(a1.get(25))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public void proGlasses() throws InterruptedException {
		log.info("Pro");
		extentTest =extentReport.createTest("ProGlasses");
		Actions a=new Actions(driver);
		WebElement lenses=driver.findElement(By.xpath(a1.get(23)));
		a.moveToElement(lenses).build().perform();
		driver.findElement(By.xpath(a1.get(27))).click();
		driver.findElement(By.xpath(a1.get(28))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public void transitions() throws InterruptedException {
		log.info("Transitions");
		extentTest =extentReport.createTest("Transitions");
		Actions a=new Actions(driver);
		WebElement lenses=driver.findElement(By.xpath(a1.get(23)));
		a.moveToElement(lenses).build().perform();
		driver.findElement(By.xpath(a1.get(30))).click();
		driver.findElement(By.xpath(a1.get(31))).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}

}
