package Day.Five;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q3 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("919514519694");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("10451718");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")).click();
        String ur=driver.getCurrentUrl();
        if(ur.equals("https://www.amazon.in/gp/your-account/order-history?ref_=ya_d_c_yo")) {
            System.out.println("Order Page");
        }
        else {
            System.out.println(false);
        }
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div/div[3]/ul/li[3]/a")).click();
        String ur2=driver.getCurrentUrl();
        if(ur2.equals("https://www.amazon.in/gp/your-account/order-history?ref_=ppx_yo2ov_dt_b_tb_open&orderFilter=open")) {
            System.out.println("Shippment page");
        }
        else {
            System.out.println(false);
        }
        driver.findElement(By.xpath("//*[@id=\"orderTypeMenuContainer\"]/ul/li[5]/span/a")).click();
        String ur21=driver.getCurrentUrl();
        if(ur21.equals("https://www.amazon.in/gp/your-account/order-history/ref=ppx_yo_dt_b_cancelled_orders?ie=UTF8&orderFilter=cancelled")) {
            System.out.println("Cancelled Page");
        }
        else {
            System.out.println(false);
        }
        Thread.sleep(2000);
        driver.close();
	}
}
