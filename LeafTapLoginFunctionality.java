package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapLoginFunctionality {

	public static void main(String[] args) {
		// Launch the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
	
		driver.manage().window().maximize();
		
		//Enter the username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Megala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kabali");
		WebElement dropdown1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options=new Select(dropdown1);
		//options.selectByIndex(6);
		//options.selectByValue("LEAD_DIRECTMAIL");
		options.selectByVisibleText("Employee");
		
		
		
		

        
      
	}

}
