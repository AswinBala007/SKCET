package com.example.day1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFour {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("")).click();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
