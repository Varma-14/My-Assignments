package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameLeafGround {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	    //Thread.sleep(1000);
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(2);
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
	    //Thread.sleep(1000);
	    driver.switchTo().defaultContent();
	}

}

