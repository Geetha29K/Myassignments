package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) {
	
		ChromeDriver driver= new ChromeDriver();
		
		driver.get(" https://login.salesforce.com");
		driver.manage().window().maximize();
		//WebElement eleUsername=driver.findElement(By.id("username"));
		//eleUsername.sendKeys("hari.radhakrishnan@qeagle.com");
          driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
          driver.findElement(By.id("password")).sendKeys("Leaf@123");
          driver.findElement(By.id("Login")).click();
	}

}
