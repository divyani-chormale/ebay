package Inntro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framespractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe" );
		 WebDriver driver=new FirefoxDriver();
		    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   List<WebElement>iframee= driver.findElements(By.xpath("//*[@class='blinkingText']"));
		  
       System.out.println("size"+iframee.size());
	}}
