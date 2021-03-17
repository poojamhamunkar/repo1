package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {//senior automation TE

private WebElement untb;
private WebElement pwtb;
private WebElement loginButton;

LoginPage1 (WebDriver driver)    {//constructor initialization
	untb = driver.findElement(By.id("username"));
    pwtb = driver.findElement(By.name("pwd"));
    loginButton= driver.findElement(By.xpath("//div[.='Login ']"));
}

public void setUsername(String usn) 
{
untb.sendKeys("usn");       //utilization
}
public void setPassword(String pw)
{
pwtb.sendKeys("pw");       //utilization
}
public void clickLogin(){
{
loginButton.click();       //utilization
}
}
	 
	 
	 


}
