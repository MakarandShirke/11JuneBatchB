package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));  //Main source Hello, Makarand element
		
		WebElement des = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")); //Inner Sign in element
		
		Actions a = new Actions(driver);
		
		a.moveToElement(src).moveToElement(des).click().perform();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7517268505");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mak@12345");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		Thread.sleep(2000);
		
        WebElement exit = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"));
		
		WebElement sout = driver.findElement(By.xpath("(//span[@class='nav-text'])[18]"));
		
		Actions s = new Actions(driver);
		
		s.moveToElement(exit).perform();
		
		s.moveToElement(sout).click().perform();
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7517268505");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mak@12345");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
        driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']")).click();
		
		String url1 = driver.getCurrentUrl();
		
		System.out.println(url1);
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		Thread.sleep(2000);
		
        WebElement exitagain = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"));
		
		WebElement soutagain = driver.findElement(By.xpath("(//span[@class='nav-text'])[18]"));
		
		Actions x = new Actions(driver);
		
		x.moveToElement(exitagain).perform();
		
		x.moveToElement(soutagain).click().perform();
		
		Thread.sleep(3000);
	

		driver.close();
	
		
	
}



}
