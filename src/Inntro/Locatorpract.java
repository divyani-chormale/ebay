package Inntro;

import java.util.concurrent.TimeUnit;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Locatorpract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    String username="rahul";
	    String password=getpassword(driver);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.xpath("//*[@id='inputUsername']")).sendKeys(username);
	    driver.findElement(By.xpath("//*[@name='inputPassword']")).sendKeys(password);
	    driver.findElement(By.xpath("//*[@class='submit signInBtn']")).click();
	   Thread.sleep(2000);
	   System.out.println(driver.findElement(By.tagName("p")).getText());
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
//	   WebElement text=driver.findElement(By.xpath("//*[@class='error']"));
//	 System.out.println(text.getText());
//	//    System.out.println(driver.getCurrentUrl());
	    driver.quit();

	}

	private static String getpassword(WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='reset-pwd-btn']")).click();
	String passwordtext = driver.findElement(By.xpath("//*[@class='infoMsg']")).getText();
	String[]passarray=passwordtext.split("'");
	String password=passarray[1].split("'")[0];
				return password;
	

	
	}

}
