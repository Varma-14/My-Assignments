package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
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
		 WebElement dropDown1= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1= new Select(dropDown1);
		dd1.selectByVisibleText("Cold Call");
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2= new Select(dropDown2);
		dd2.selectByVisibleText("Aerospace");

		
		
		
		
		 
		
		
		
		
		
	}

}
