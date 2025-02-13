package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Home_Assignment {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//Load url
		
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Megala");
		driver.findElement(By.name("lastname")).sendKeys("G");
		//Select date dropdown
		WebElement day=driver.findElement(By.id("day"));
		Select dayOption=new Select(day);
		dayOption.selectByValue("31");
		//Select month dropdown
		
		WebElement month=driver.findElement(By.id("month"));
		Select monthOption=new Select(month);
		monthOption.selectByVisibleText("May");
		
		//select year
		WebElement year=driver.findElement(By.id("year"));
		Select yearOption=new Select(year);
		yearOption.selectByVisibleText("1990");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("9840144161");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Praneeth@123");
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
	}

}
