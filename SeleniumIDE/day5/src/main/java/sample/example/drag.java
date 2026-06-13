package sample.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag {
	public static void main(String[] arsf) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co=new ChromeOptions(); 
//		co.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demoqa.com/droppable/");
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}
}