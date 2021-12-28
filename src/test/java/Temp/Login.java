package Temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
		
		@Test
		public void metamask() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
				
			driver.get("https://main.d1wxtput80cmif.amplifyapp.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[text()='Login']")).click();
			
			System.out.println("Login button click successfully");
			
			
			
		
	}

}
