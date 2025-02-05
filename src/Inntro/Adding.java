package Inntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	   // String[] items= {"Cucumber","Brocolli","Cauliflower","Beetroot"};
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    for(int i=0;i<5;i++)
	    {
	    	driver.findElement(By.xpath("//* [@class='increment']")).click();
	    i++;
	    }
	    driver.findElement(By.xpath("//* [@class='product-action']")).click();

	}

}
