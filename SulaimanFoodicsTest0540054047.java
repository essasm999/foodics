// Sulaiman AlEssa 0540054047 - Foodics Senior Software Quality Engineer essasm@hotmail.com

// The first Task

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
		driver.get("https://www.amazon.eg/");

		System.out.println("The site which is open");

		// Maximize the page
		driver.manage().window().maximize();
		System.out.println("The Window Maximized");

		// Keep the browser opened
		Thread.sleep(1000);

		// scroll down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Select All button
		WebElement all = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));
		// Click on the button
		all.click();

		// Keep the browser opened
		Thread.sleep(1000);

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Scroll down");

		// Keep the browser opened
		Thread.sleep(1000);

		// Click on See More
		WebElement SeeMore = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[14]/a[1]"));
		// Click on the button
		SeeMore.click();
		System.out.println("Click on See More");

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,150)");
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Scroll down2");

		// Keep the browser opened
		Thread.sleep(1000);

		// Click on Video Games
		WebElement VGames = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[11]/a"));
		// Click on the button
		VGames.click();
		System.out.println("Click on Video Games");

		// Keep the browser opened
		Thread.sleep(1000);

		// Click on All Video Games
		WebElement AVGames = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[16]/li[3]/a"));
		// Click on the button
		AVGames.click();
		System.out.println("Click on All Video Games");

		// Keep the browser opened
		Thread.sleep(1000);

		// Click on Free Shipping
		WebElement FShip = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div[1]/label"));
		// Click on the button
		FShip.click();
		System.out.println("Click on Free Shipping");

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,150)");
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Scroll down2");

		// Keep the browser opened
		Thread.sleep(1000);

		// Click on New Condition
		WebElement newC = driver.findElement(By.xpath("//*[@id=\"p_n_condition-type/28071525031\"]/span/a/span"));
		// Click on the button
		newC.click();
		System.out.println("Click on New Condition");

		// Keep the browser opened
		Thread.sleep(1000);

		// Click on Features
		WebElement fet = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
		// Click on the button
		fet.click();
		System.out.println("Click on Features");

		// Keep the browser opened
		Thread.sleep(1000);

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,150)");
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Scroll down5");

		// Click on Select Price High to Low
		WebElement HTL = driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]"));
		// Click on the button
		HTL.click();
		System.out.println("Click on Price High to Low");

		// Keep the browser opened
		Thread.sleep(1000);

		// Keep the browser opened
		Thread.sleep(1000);

		// Keep the browser opened
		Thread.sleep(1000);

		// Keep the browser opened
		Thread.sleep(1000);

		// Keep the browser opened
		Thread.sleep(1000);

		// This will scroll down the page by 1000 pixel vertical
		// js.executeScript("window.scrollBy(0,1500)");
		// // Keep the browser opened
		// Thread.sleep(2000);
		// System.out.println("Scroll down3");

		// Keep the browser opened
		Thread.sleep(1000);

		// Click on First Product
		WebElement first = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[11]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		first.click();
		System.out.println("Click on First Product");

		// Click on Add to cart
		WebElement save = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		save.click();
		System.out.println("Add to cart");

		// Keep the browser opened
		Thread.sleep(1000);

		// Go Back
		driver.navigate().back();
		// Go Back
		driver.navigate().back();

		
		// Click on Second Product
		WebElement second = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[12]/div/div/div/div/div/div[2]/div/div/div[1]/h2"));
		second.click();
		System.out.println("Click on Second Product");

		// Click on Add to cart Second Product
		WebElement Ssave = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		Ssave.click();
		System.out.println("Added to cart Second Product");

		// Keep the browser opened
		Thread.sleep(1000);

		// Go Back
		driver.navigate().back();
		// Go Back
		driver.navigate().back();

		
		// Click on Third Product
		WebElement third = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[13]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		third.click();
		System.out.println("Click on Third Product");

		// Click on Add to cart Third Product
		WebElement Tsave = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		Tsave.click();
		System.out.println("Added to cart Third Product");

		// Keep the browser opened
		Thread.sleep(1000);

		// Go Back
		driver.navigate().back();
		// Go Back
		driver.navigate().back();

		// Added Click on Forth Product
		WebElement forth = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[17]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		forth.click();
		System.out.println("Click on Forth Product");

		// Click on Add to cart Second Product
		WebElement Fsave = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		Fsave.click();
		System.out.println("Added to cart Forth Product");

		// Keep the browser opened
		Thread.sleep(1000);

		// Go Back
		driver.navigate().back();
		// Go Back
		driver.navigate().back();

		// Click on Fifth Product
		WebElement five = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[14]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		five.click();
		System.out.println("Click on  Product");

		// Click on Add to cart Second Product
		WebElement ffsave = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		ffsave.click();
		System.out.println("Added to cart Fifth Product");

		// Keep the browser opened
		Thread.sleep(1000);

		// Go Back
		driver.navigate().back();
		// Go Back
		driver.navigate().back();

		// Added Click on Sixth Product
		WebElement six = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[16]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		six.click();
		System.out.println("Click on Sixth Product");

		// Click on Add to cart Second Product
		WebElement fssave = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		fssave.click();
		System.out.println("Added to cart Sixth Product");

		// Keep the browser opened
		Thread.sleep(1000);

		// Go Back
		driver.navigate().back();
		// Go Back
		driver.navigate().back();

		// Click on check out
		WebElement me = driver.findElement(By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a"));
		me.click();
		System.out.println("Click Go To Basket");

		// Will click on Proceed to Buy
		WebElement save1 = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"))	;
		save1.click();
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Continue click on Proceed to Buy");

		
		// Wait To Cupture

		Thread.sleep(3000);

		// Close the Browser
		driver.quit();

		System.out.println("The Task A Done");
		
	}

}
