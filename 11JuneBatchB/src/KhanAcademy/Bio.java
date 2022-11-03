package KhanAcademy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bio {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.khanacademy.org/");
	
	driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("(//button[@class='_1up6svzf'])[1]")).click();
	
	Set<String> ids = driver.getWindowHandles(); // to get address of different tabs//random
	
	ArrayList<String> a1 = new ArrayList<String>(ids); // exact tab get in object of ArrayList
	
	String cwid = a1.get(1);// to get address of child browser

	driver.switchTo().window(cwid);
	
    driver.findElement(By.xpath("(//input[@type='email']")).sendKeys("shirkemakarand8@gmail.com");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
	
   //	driver.findElement(By.xpath("//div[@class='user-deets editable']")).click();
	
	
	
	Thread.sleep(2000);
	
	
	}

}
