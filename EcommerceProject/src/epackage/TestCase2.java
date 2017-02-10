package epackage;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 extends TestCase1{
	
	//Set<String> list = (Set<String>) new ArrayList<String>();
	@Test
	public void testTestCase2() throws Exception{
		//go to http://live.guru99.com
		
		driver.get(baseUrl);
		//driver.findElement(By.id("viewport")).click();
		/**String parent = driver.getWindowHandle();
		
        Set<String> pops=driver.getWindowHandles();
        {
        Iterator<String> it =pops.iterator();
        while (it.hasNext()) {

            String popupHandle=it.next().toString();
            if(!popupHandle.contains(parent))
            {
            driver.switchTo().window(popupHandle);
            System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
            driver.close();
		
		**/
		
		
		//2. cliick on the mobile menu
		//Robot robot=new Robot();
		//robot.keyPress(KeyEvent.VK_ACCEPT);
		driver.findElement(By.linkText("MOBILE")).click();
		//3. In the list of all mobile , read the cost of sony xperia mobile(should be 100)
	//	driver.switchTo().alert();
	//	alert.accept();
		String XPeriaPrice=driver.findElement(By.cssSelector("#product-price-1> span.price")).getText();
		
		
		//4. Click on sony Xperia mobile
		Thread.sleep(2000);
	//	driver.findElement(By.xpath(".//*[@id='product-collection-image-1']"));
		driver.findElement(By.id("product-collection-image-1 ")).click();
		//5.Read the Xperia mobile price from details page
		String detailPrice =driver.findElement(By.cssSelector("span.price")).getText();
		//product price in list and details page should be equal ($100)
		System.out.println(XPeriaPrice);
		System.out.println(detailPrice);
		Assert.assertEquals(XPeriaPrice, detailPrice);
		
		
	}
	
	
	

}
