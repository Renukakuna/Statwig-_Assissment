  package Com.renuka_Statwig_vaccine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login_page {
      WebDriver driver;
	@BeforeClass
	public void Before() {
		driver=new ChromeDriver();
	}
		@Test
		public void Applicationopen() {
			driver.get("https://vaccineledger.com/");
			driver.manage().window().maximize();
		
		}

@AfterClass
public void logout()
{
	Reporter.log("logout");
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/nav/ul/li[5]/div/div[1]/img")).click();
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/nav/ul/li[5]/div/div[2]/div[3]/div/p")).click();
}}