package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/web%20tech/poojasele.html");
		//driver.findElement(By.id("t1")).sendKeys("ABCDEFGHIJKLMNOP");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavaScriptExecutor)driver;
		js
		driver.close();
}
}