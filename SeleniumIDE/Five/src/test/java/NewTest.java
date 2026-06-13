import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
//import junit.framework.Assert;

public class NewTest {
  @Test
  public void f() {
  }
  @Test(priority=2)
  public void TC_001() {
//	 System.out.println("method one");
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  Assert.assertEquals(title,"Guest Registration Form – User Registration");

  }
  int a=10,b=20,c;
//	c->result
@Test
public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 30);
}
}
