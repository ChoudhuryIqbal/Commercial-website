package epackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase4 extends TestCase1
{

	@Test
	public void testTestCase4() throws InterruptedException{
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("MOBILE")).click();
		Thread.sleep(2000);
		//3. 
		driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a"));
		String mainMobile1=driver.findElement(By.xpath(""))
	
	}	

}
