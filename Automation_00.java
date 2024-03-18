package Automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_00 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Point ppp = new Point(0,1200);
		driver.manage().window().setPosition(ppp);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.quit();
	}

}
