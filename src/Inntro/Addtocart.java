package Inntro;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();	
	//
      

	        // Initialize WebDriver
	        WebDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@id='gh-ac']"));
		search.sendKeys("books");
		driver.findElement(By.xpath("//*[@class='gh-search-button__label']")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[3]/div[1]/div[3]/ul/li[1]/div/div[2]/a/div/span")).click();
	
	Thread.sleep(3000);
	String parentWindow = driver.getWindowHandle();
	
	WebElement fclick = driver.findElement(By.xpath("//div[@id=\"srp-river-main\"]/div[3]/ul/li[1]/div/div/div/a/div/img"));
			
	fclick.click();   
	
	Thread.sleep(2000);

	
    Set<String> handles = driver.getWindowHandles();
	
	Iterator it = handles.iterator();
	
	for(String windowhandle:handles) {
		driver.switchTo().window(windowhandle);
	}
	
	WebElement selectp = driver.findElement(By.xpath("//div[@class=\"vim vi-evo-row-gap\"]/ul/li[2]/div/a"));
	
	selectp.click();
		
	Thread.sleep(3000);
    WebElement Expected_xpath = driver.findElement(By.xpath("//div[@class=\"app-cart\"]/div/ul/li/div/div/div/div/div/div[2]/div/h3/a"));
	
	String Expected = Expected_xpath.getText();
	System.out.println("First");
	System.out.println("Expected="+Expected);
	
	driver.findElement(By.xpath("//span[@class=\"gh-cart__icon\"]/span")).click();
	
	WebElement actual_xpath = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[1]/div[4]/div/div/div[2]/div/div[1]/div[6]/ul/li[2]/div/a/span/span"));
	
	String actual = actual_xpath.getText();
	
	System.out.println("actual  ="+actual);
    Assert.assertEquals(actual, Expected);
    
    if(actual.equals(Expected)) {
    	System.out.println("True");
    }else {
    	System.out.println("False");
    }
	
	driver.quit();
	
	
	


		
	
	
	}
	
	
}
		
		
		
		
		
		
		
		