package sele1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe ");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(2000);
		driver.close();

	}

}
