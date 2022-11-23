package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenKartRegister {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("jakki14");
		driver.findElement(By.name("firstname")).sendKeys("sreedhar");
		driver.findElement(By.name("lastname")).sendKeys("varma");
		driver.findElement(By.name("email")).sendKeys("sreedharvarma2614@gmail.com");
		
		WebElement country = driver.findElement(By.name("country_id"));
		Select code= new Select(country);
		code.selectByValue("99");
		
		driver.findElement(By.name("password")).sendKeys("sk14@jk");
	}

}
