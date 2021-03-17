package sele1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage1{
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("http://demo.actitime.com/login.do");
LoginPage1 l1 = new LoginPage1(driver);
l1.setUsername("Dinga");
Thread.sleep(3000);
l1.setPassword("Dingi");
Thread.sleep(3000);
l1.clickLogin();
Thread.sleep(5000);
driver.close();
}
}

