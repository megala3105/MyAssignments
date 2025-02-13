package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		//Load url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//Enter the username and password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Partial attribute match using contains keyword
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
		
		//Partial match with text
		//driver.findElement(By.xpath("//input[contains(text(),'create')]")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Create Lead")).click();

	}

}
