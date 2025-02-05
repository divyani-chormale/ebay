package Inntro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		driver.findElement(By.id("windowButton")).click();
		String	main=driver.getWindowHandle();
	Set<String>child=driver.getWindowHandles();
	for(String c1:child)
	{
		if(!main.equalsIgnoreCase(c1))
		{
			
			driver.switchTo().window(c1);
			WebElement text = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
			 System.out.print("nameg"+text.getText());
		}
		
	}
         
	}

}
