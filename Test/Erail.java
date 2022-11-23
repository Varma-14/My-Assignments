package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(By.id("txtStationFrom"));
		frm.clear();
		frm.sendKeys("MAS");
		frm.sendKeys(Keys.TAB);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("JP");
		to.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
		driver.findElement(By.xpath("//td[@onclick='DoDateSelect(1669314600000)']")).click();
		  Thread.sleep(3000);
		  List<WebElement> trains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		  System.out.println(trains.size());
		 for (int i = 0; i < trains.size(); i++) {
			 String value=trains.get(i).getText();
			 System.out.println(i+"-"+value);
			 
			 
			 
			 
			 
			 
			 
	}

}
}
