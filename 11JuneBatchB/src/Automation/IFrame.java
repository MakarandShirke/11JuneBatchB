package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			
			WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
			
			driver.switchTo().frame(iframe1);
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
			driver.switchTo().parentFrame(); //it will navigate from child frame to immediate parent Frame
			
			// driver.switchTo().defaultContent(); //it will navigate from any child to main page
			
			driver.findElement(By.xpath("//a[@id='tryhome']")).click();
			
			
			
			
			
			
			
			
			
	
	
	}

}
