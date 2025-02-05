package Inntro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com");
	WebElement go = driver.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
	go.sendKeys("Facebook");
	Actions act=new Actions(driver);
	act.sendKeys(go,Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
}
}