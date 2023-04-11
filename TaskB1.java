// Sulaiman AlEssa 0540054047 - Foodics Senior Software Quality Engineer - essasm@hotmail.com

// The Task B 3 Test Cases 
// 1) Login Success / failed - What's the message
// 2) Branches Disabeled
// 3) Payment

// 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import jdk.javadoc.doclet.Reporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Test
public class SulaimanFoodicsTest0540054047 {
	public void testLegalzoom() throws InterruptedException {

		// Get the Path for the Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cm\\Desktop\\chromedriver.exe");

		// Create the Chrome's WebDriver
		WebDriver driver = new ChromeDriver();

		// open the link in Chrome
		driver.get("https://pay2.foodics.dev/login");

		System.out.println("The site which is open");

		// Maximize the page
		driver.manage().window().maximize();
		System.out.println("The Window Maximized");

		// Keep the browser opened
		Thread.sleep(1000);

		// Send Key on Login UserName
		WebElement cri = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		cri.sendKeys("merchant@foodics.com");

		// Send on Password index Wrong
		WebElement tb = driver.findElement(By.xpath("//*[@id=\"form-box-body\"]/div[1]/div[2]/div[2]/div/div/input"));
		tb.sendKeys("12");
		// click on Login button
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"form-box-body\"]/div[2]/button"));
		Login.click();
		System.out.println("Logged in Wrong Way!");

		// wait period
		Thread.sleep(1000);

//Send on Password index Correct
		WebElement tb1 = driver.findElement(By.xpath("//*[@id=\"form-box-body\"]/div[1]/div[2]/div[2]/div/div/input"));
		tb1.sendKeys("123456");

		// click on Login button
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"form-box-body\"]/div[2]/button"));
		Login.click();
		System.out.println("Logged in Successfully");

		// Keep the browser opened
		Thread.sleep(2000);

		// Click on Branches
		WebElement save1 = driver
				.findElement(By.xpath("//*[@id=\"sidebar-body\"]/div[1]/div[2]/div[6]/ul/li/div/a/div/div[1]/div[2]"));
		save1.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on Branches");

		// Click on filter
		WebElement save2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div[1]/div/button"));
		save2.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on filter");

		// Click on Enabled Branches
		WebElement save3 = driver.findElement(By.xpath("//*[@id=\"is_active\"]"));
		save3.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on Enabled Branches");

		// Click on Enabled Branches
		WebElement save4 = driver.findElement(By.xpath("//*[@id=\"is_active\"]"));
		save4.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on Enabled Branches");

		// Click on Choose disabled Branches
		WebElement save5 = driver.findElement(By.xpath("//*[@id=\"is_active\"]/option[3]"));
		save5.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on Disabled Branches");

		// Click on Apply Branches
		WebElement save6 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div/div/div[3]/div/button"));
		save6.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on Aplly Branches");
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("There is no Disabled Branches");

		// Click on Payment
		WebElement savea = driver
				.findElement(By.xpath("//*[@id=\"sidebar-body\"]/div[1]/div[2]/div[3]/ul/li/div/a/div/div[1]/div[2]"));
		savea.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on Payment");

		// Click on Processed
		WebElement saves = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div[1]/div[1]/a[2]"));
		saves.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on Processed");

		// Click on first payment
		WebElement saved = driver.findElement(By.xpath("//*[@id=\"listing-table\"]/tbody/tr[1]/td[1]"));
		saved.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Click on first Payment");

		// Keep the browser opened
		Thread.sleep(2500);
		System.out.println("The first payment receipt appear ");

		// Wait To Cupture

		Thread.sleep(3000);

		// Close the Browser
		driver.quit();

		System.out.println("The Task A Done");

	}

}
