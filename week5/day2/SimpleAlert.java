package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
alert.accept();		
driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
Alert alert1 = driver.switchTo().alert();
Thread.sleep(2000);
alert1.accept();
driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
driver.switchTo().alert().sendKeys("TestLeaf");
Alert alert2 = driver.switchTo().alert();
alert2.accept();









		
	}

}
