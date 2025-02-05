package Inntro;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbxhand {
	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://total-qa.com/checkbox-example/#google_vignette");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("Window.ScrollBy(0,1000","");
		 List<WebElement> check = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
	
		for(WebElement all:check)
		{
			if(!all.isSelected())
			{
			all.click();
				
				
			}
		}
			
			
		}
		//driver.close();
	}
	
	
