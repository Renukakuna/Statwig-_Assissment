package Com.renuka_Statwig_vaccine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login1 {

	public static void main(String[] args) {
	
		

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.get("https://vaccineledger.com/");
		 driver.manage().window().maximize();
		    
		    
		 Select st=new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/nav/ul/li[5]/section[2]/article[1]/p")));
		 st.selectByVisibleText("Inglés");
		

	}

}
