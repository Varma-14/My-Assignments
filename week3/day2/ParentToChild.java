package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentToChild {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://dev141581.service-now.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='login-form-field']/input")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@class='input-group password-group']/input")).sendKeys("iX-66uY+DwSi");
		driver.findElement(By.id("sysverb_login")).click();
		
		
		
		
	}

}
