package com.Multipleframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MF1 {
	WebDriver driver;

	@Test
	public void Frames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver_jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/Administrator/Documents/Aditi%20Rana/Selinium%20class/Selenium%20Practices/Frames.html");
		driver.manage().window().maximize();
		int totalframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames:" + totalframes);

		driver.switchTo().frame("HollandandBarret");
		driver.get("https://www.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("usename")).sendKeys("raghu.astepahead@gmail.com");
		driver.findElement(By.name("password")).sendKeys("raghuBN@123");
		driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();

		driver.navigate()
				.to("C:\\Users\\Administrator\\Documents\\Aditi Rana\\Selinium class\\Selenium Practices\frames.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();

		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);

		driver.navigate()
				.to("C:\\\\Users\\\\Administrator\\\\Documents\\\\Testing course\\\\Frames selenium\\\\frame.html");
		driver.switchTo().frame("My Store");
		driver.navigate().to("https://demo.opencart.com/");
		driver.findElement(By.name("search")).sendKeys("products");
		driver.findElement(By.xpath("//*[@id=\"search\"]/button/i")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
