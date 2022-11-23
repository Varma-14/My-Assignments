package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sreedharvarma2614@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SvjK14@");
		
				
	}

}
