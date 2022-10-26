package week2.day4Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignMent4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
driver.manage().window().maximize();
driver.findElement(By.name("username")).sendKeys("varma08");
		
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sreedhar");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("varma");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sreedharvarma2614@gmail.com");

WebElement country_id=driver.findElement(By.name("country_id"));
Select dd1=new Select(country_id);
dd1.selectByVisibleText("India");

driver.findElement(By.xpath("//input[@name='password']")).sendKeys("********");
driver.findElement(By.xpath("//button[text()='Register']")).click();
		
	}

}
