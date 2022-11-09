package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.accept();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert3.dismiss();
		WebElement value = driver.findElement(By.xpath("//span[@id='result']"));
		String text=value.getText();
		System.out.println(text);
		  if(value.getText().equals("User Clicked : Cancel")) {
		    	System.out.println("Confirmed dialog");
		    } else {
		    	System.out.println("Not Confirmed");
		    }
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).click();

		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		Alert alert5 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert5.sendKeys("sreedhar varma");
		alert.accept();
		String name = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(name);
		 driver.findElement(By.xpath("//button[@id='j_idt88:j_idt106']")).click();
		 Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt109']")).click();
		    
		    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		    
		




	}

}
