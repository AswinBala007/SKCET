package Day.Five;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prb73 {
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	}

	@Test
	public void TC_001()
	{
		
	}
	
	@AfterTest
	public void aftertest()
	{
		
	}
}
