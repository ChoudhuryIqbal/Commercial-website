package epackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase3  extends TestCase1{
	
	
	@Test
	public void testTestCase3() throws Exception{
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("MOBILE")).click();
		driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button")).click();
		//change qty value to 1000
		driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).clear();
		driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).sendKeys("1000");
		driver.findElement(By.className("button.btn-update")).click();
		
		
		//verify error message
		String reqQty=driver.findElement(By.xpath(""))
		
		
	}

}
