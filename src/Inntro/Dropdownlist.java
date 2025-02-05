package Inntro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	    WebElement dropdown = driver.findElement(By.xpath("//*[@name='dropdown-class-example']"));
//	    Select sel=new Select(dropdown);
//	     WebElement drop = sel.getFirstSelectedOption();
//	     String dp=drop.getText();
//	     sel.selectByIndex(1);
//	    System.out.println(dp);
	  List<WebElement> alloptions = driver.findElements(By.xpath("//*[@id='dropdown-class-example']"));
	
	  for(WebElement options:alloptions)
	  {
		  if(options.getText().equals("option1"));
		  {
			  options.click();
			  System.out.println(options.getText());
		  }
	  }
	  //  System.out.println(driver.getCurrentUrl());
	    driver.quit();
	}

}
