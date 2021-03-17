package sele1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("http://demo.actitime.com/login.do");
LoginPage l1 = new LoginPage(driver);
l1.setUsername();
Thread.sleep(3000);
l1.setPassword();
Thread.sleep(3000);
l1.setLoginclick();
Thread.sleep(5000);
driver.close();
}
}
