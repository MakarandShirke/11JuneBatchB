package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

   public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://nxtgenaiacademy.com/alertandpopup/");
			
			Thread.sleep(2000);
			
	       driver.findElement(By.xpath("//button[@name = 'alertbox']")).click();
	       
	       Thread.sleep(3000);
	       
	       driver.switchTo().alert().accept();
			
					
			
   }
			
		

}
