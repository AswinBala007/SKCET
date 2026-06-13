package Day.Five;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class amazon
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		try {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(9000);
		}
		catch (NoSuchElementException exception) 
		{
			driver.findElement(By.id("ap_email")).sendKeys("919514519694");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("10451718");
			driver.findElement(By.id("signInSubmit")).click();	
		}
		
	}
}
