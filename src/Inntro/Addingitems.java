package Inntro;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addingitems {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    String[] items= {"Cucumber","Brocolli","Cauliflower","Beetroot"};
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> list = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for(int i=0;i<list.size();i++)
		{
			
			
			String[] name=list.get(i).getText().split("-");
			String format=name[0].trim();
	List Items1=Arrays.asList(items);
	
			
			    if(Items1.contains(format))
					{
						driver.findElements(By.xpath("//*[@class='product-action']")).get(i).click();
				    
				    }
			
				}
			
		}
		
	}


