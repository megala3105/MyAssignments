package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Launch browser
		//chromer browser
		//chromedriver is a class
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://platform.testleaf.com/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.close();

	}

}
