package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		
	
			WebDriverManager.chromedriver().setup();;
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sreedhar");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Varma");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jakki");
			driver.findElement(By.name("departmentName")).sendKeys("QA Engineer");
			driver.findElement(By.name("description")).sendKeys("Selenium WebDriver");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sreedharvarma2614@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.className("subMenuButton")).click();
			driver.findElement(By.name("description")).clear();
			driver.findElement(By.name("importantNote")).sendKeys("Automation engineering is the best");
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
			
	System.out.println(title);
			
			
			
			
			
			
		
	
	}
}
