package Inntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drpdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
	    for(int i=0;i<5;i++)
	    {
	    	driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
	    i++;
	    }
	    driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();

	}

}
