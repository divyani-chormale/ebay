package Inntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Divyani");
	    driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	  
	    driver.quit();
	    
	    
	    

	}

}
