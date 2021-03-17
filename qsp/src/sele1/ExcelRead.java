package sele1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException, EncryptedDocumentException,
FileNotFoundException, IOException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://demo.actitime.com/login.do");
LoginPage1 l=new LoginPage1(driver);

String path = "./data/pooja.xlsx";
Workbook wb = WorkbookFactory.create(new FileInputStream(path));
for(int i=0;i<6;i++) {
String usn = wb.getSheet("Actitime").getRow(i).getCell(0).toString();
l.setUsername(usn);
Thread.sleep(1000);

String pwd = wb.getSheet("Actitime").getRow(i).getCell(1).toString();
l.setPassword(pwd);
Thread.sleep(3000);
l.clickLogin();
}
Thread.sleep(5000);
driver.close();
}
}









