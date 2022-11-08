package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildToParent {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https:/login.salesforce.com/");
		driver.manage().window().maximize();
		
		
	}

}
