package Inntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    System.out.println(driver.getCurrentUrl());
    driver.quit();
	}

}
