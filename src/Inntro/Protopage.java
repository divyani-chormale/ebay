package Inntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.auto.common.Visibility;

public class Protopage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    driver.findElement(By.xpath("//*[@name='name'][1]")).sendKeys("Divyani Chormale");
	    driver.findElement(By.xpath("//*[@name='email']")).sendKeys("divyani.ch20@gmail.com");
	    driver.findElement(By.xpath("//*[@id='exampleInputPassword1']")).sendKeys("Divyani");
	    driver.findElement(By.xpath("//*[@id='exampleCheck1']")).click();
	    WebElement Drop = driver.findElement(By.xpath("//*[@id='exampleFormControlSelect1']"));
       Select sel =new Select(Drop);
       sel.selectByIndex(1);
       driver.findElement(By.xpath("//*[@id='inlineRadio2']")).click();
       driver.findElement(By.xpath("//*[@name='bday']")).sendKeys("02/09/1995");
       driver.findElement(By.xpath("//*[@type='submit']")).click();
     WebElement text = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
	    System.out.println(text.getText());
	}

}
