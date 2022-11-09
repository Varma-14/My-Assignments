package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFrameProgram {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
Alert promptAlert = driver.switchTo().alert();
promptAlert.sendKeys("Sreedhar Varma");
promptAlert.accept();

String text = driver.findElement(By.id("demo")).getText();
System.out.println(text);
driver.switchTo().defaultContent();
		
	}
	

}
