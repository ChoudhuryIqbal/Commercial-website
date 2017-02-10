package epackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase10 {
	private String baseUrl;
	private WebDriver driver;
	private String vUsername="user01";
	private String vPassword="guru99com";
	@BeforeTest
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a\\WorkSpace_Commerce\\EcommerceProject\\src\\ScreenShot\\chromedriver.exe");
		driver =new ChromeDriver();
		baseUrl="http://live.guru99.com/index.php/backendlogin";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testTestCase10() throws Exception{
		//go to backend url
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(vUsername);;
		driver.findElement(By.xpath(".//*[@id='login']")).sendKeys(vPassword);
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div[5]/input")).click();
		
		try{
			
			Thread.sleep(5000);
		}
		catch(Exception e){
			e.getMessage();
		}
		
		for(String handle: driver.getWindowHandles()){
			driver.switchTo().window(handle);
			
			
		}
		
		driver.findElement(By.linkText("Salas")).click();
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		driver.findElement(By.linkText("Orders")).click();
		Thread.sleep(4000);
		for(String handle: driver.getWindowHandles()){
			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='id_bd3d219320532922a8b5876d134866a5']")).click();
		Thread.sleep(5000);
		String filePath=System.getProperty("user.home")+"/Downloads/orders.csv";
		try{
			
			
		}
		catch(Exception e){
			
		}
	}

}
