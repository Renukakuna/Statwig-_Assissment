package Com.renuka_Statwig_vaccine;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
	public class  Assesment {
	WebDriver driver;
		@BeforeClass
		public void Before() {
			driver=new ChromeDriver();
			driver.get("https://vaccineledger.com/");
			driver.manage().window().maximize();
		}
			@Test
			public void language() throws InterruptedException {
				Reporter.log("Application open");
				driver.findElement(By.xpath("/html/body/div/div/div/header/div/nav/ul/li[6]/button")).click();
				 driver.findElement(By.name("firstName")).sendKeys("ramu");
				 driver.findElement(By.name("lastName")).sendKeys("raju");
				 driver.findElement(By.name("email")).sendKeys("renukainkprog12@gmail.com");
				 driver.findElement(By.name("phone")).sendKeys("9502953341");
				 driver.findElement(By.name("organizationExists")).click();
				 driver.findElement(By.xpath("/html/body/div/div/div/section/div/div[2]/div[2]/div/section/div/form/section[2]/div[5]/div[1]/div/div/div/button[2]/svg")).sendKeys("DROGUERIA");			 
	driver.findElement(By.xpath("/html/body/div/div/div/section/div/div[2]/div[2]/div/section/div/form/section[2]/div[5]/div[2]/div/div/div/button[2]/svg/path")).sendKeys("Hospital CIMA");
				 driver.findElement(By.xpath("/html/body/div/div/div/section/div/div[2]/div[2]/div/section/div/form/section[3]/button")).click();
				 }
	@Test	
	public void login() {
	Reporter.log("Application");
		driver.findElement(By.id("outlined-basic")).sendKeys("dev@statwig.com");
		driver.findElement(By.xpath("/html/body/div/div/div/section[1]/div/div/article[2]/div/form/div[2]/button")).click();
		driver.findElement(By.id("otp0")).sendKeys("1");
		driver.findElement(By.id("otp1")).sendKeys("2");
		driver.findElement(By.id("otp2")).sendKeys("3");
		driver.findElement(By.id("otp3")).sendKeys("4");
		driver.findElement(By.xpath("/html/body/div/div/div/section/div/div[2]/div[2]/div/section/div/form/section[2]/button")).click();
	}
	@AfterClass
	public void logout()
	{
		Reporter.log("logout");
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/nav/ul/li[5]/div/div[1]/img")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/nav/ul/li[5]/div/div[2]/div[3]/div/p")).click();
	}}



