package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class NewTest {
//  @Test
//  public void f() {
//  }
  @Test(priority=2)
  public void TC_001() {
	 System.out.println("method one");
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver=new EdgeDriver();
	 driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	 Assert.assertEquals(title,"Guest Registration form - User Registration");
  }
  
}
