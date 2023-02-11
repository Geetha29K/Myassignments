package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
	
		ChromeDriver Driver =new ChromeDriver();
        Driver.get("http://leaftaps.com/opentaps/control/login");
        Driver.manage().window().maximize();
        Driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        Driver.findElement(By.id("password")).sendKeys("crmsfa");
        Driver.findElement(By.className("decorativeSubmit")).click();
        Driver.findElement(By.linkText("CRM/SFA")).click();
        Driver.findElement(By.linkText("Leads")).click();
        Driver.findElement(By.linkText("Create Lead")).click();
        Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Geetha");
        Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
        Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Geetha");
        Driver.findElement(By.name("departmentName")).sendKeys("Testing");
        Driver.findElement(By.name("description")).sendKeys("Automation Testing");
        Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
        WebElement element = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        
        Select dd =new Select(element);
        
       dd.selectByVisibleText("New York");
        Driver.findElement(By.name("submitButton")).click();
        Driver.findElement(By.linkText("Edit")).click();
        Driver.findElement(By.name("description")).clear();
        Driver.findElement(By.name("importantNote")).sendKeys("Automation Testing");
        Driver.findElement(By.className("smallSubmit")).click();
        System.out.println("The Title is "+ Driver.getTitle());
        
        
	}

}
