package week.day2;

import org.openqa.selenium.edge.EdgeDriver;

public class DynamicPolymorphism_LaunchBrowser extends DynamicPolymorphism_LaunchEdge {

	
	public void launch()
	{
		EdgeDriver driver=new EdgeDriver();
		
		//super keyword used to call the methods in the parent class
		//if it is not used,then by default methods inside the child class will only execute
		super.launch();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicPolymorphism_LaunchBrowser launchedge=new DynamicPolymorphism_LaunchBrowser();
		launchedge.launch();
	}

}
