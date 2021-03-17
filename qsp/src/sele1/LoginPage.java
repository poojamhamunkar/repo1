package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


 public class LoginPage {     //senior automation engineer

private WebElement untb;
private WebElement pwtb;
private WebElement loginclk;

LoginPage(WebDriver driver)                    //constructor initialization
{
		untb = driver.findElement(By.id("username"));
        pwtb = driver.findElement(By.name("pwd"));
        loginclk = driver.findElement(By.xpath("//div[.='Login ']"));
}
public void setUsername()
{
untb.sendKeys("admin");       //utilization
}
public void setPassword()
{
pwtb.sendKeys("manager");       //utilization
}
public void setLoginclick()
{
loginclk.click();       //utilization
}
	
}

	 
	 
	 
	 
	 
	 
	 
	 
	 