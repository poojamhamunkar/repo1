package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
		static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		System.out.println(driver.getPageSource());
		driver.close();

		}
		}

	


