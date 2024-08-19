package products;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import excelUtility.ReadExcelFile;
import executionPack.Execution;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenBrowser {
	public static WebDriver driver;
	public static ArrayList<String> a1=new ArrayList<String>();
	static ExtentReports extentReport;
	static ExtentSparkReporter sparkReporter;
	public ExtentTest extentTest;
    static Logger log;
	
	public static void navigate() throws IOException {
		log = Logger.getLogger(OpenBrowser.class);
		extentReport = new ExtentReports();
		sparkReporter =new ExtentSparkReporter("ExtentReport.html");
		extentReport.attachReporter(sparkReporter);
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		ReadExcelFile rf=new ReadExcelFile();	
		a1=rf.ReadExcelData(3);
		driver.navigate().to(a1.get(2));
		driver.manage().window().maximize();
		//Thread.sleep(3000);
	}
	public static WebDriver getDriver() {
        return driver;
    }
	public void quit() {
		driver.quit();
		extentReport.flush();
	}
}
		

