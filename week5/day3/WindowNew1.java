package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowNew1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl"+currentUrl);
		//System.out.println(title);
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		String title = driver.getTitle();
		System.out.println(title);

		//Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println(windowHandles.size());
		List<String> openedWindow= new ArrayList<String>();
		driver.switchTo().window(openedWindow.get(1));
		String newWindow = driver.getCurrentUrl();
		System.out.println("newWindow"+newWindow);
		String title2 = driver.getTitle();
		System.out.println("title2"+title2);
		
		
		
	}

}
