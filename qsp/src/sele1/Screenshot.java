package sele1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.ftp.FtpDirEntry.Type;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//1. convert webdriver to take screenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//2.screenshot is stored in ram
		File src=ts.getScreenshotAs(OutputType.FILE);
		//3.created and specified the path of permanent file
		File des=new File("./photo/googless.png");
		//4.copy pasting from ram to permanent file
		FileUtils.copyFile(src, des);
		Thread.sleep(3000);
		driver.close();
	}
		
}
