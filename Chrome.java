package week.day2;

public class Chrome extends Browser  {
	
	public void openIncognito()
	{
		System.out.println("opening incoginito window");
	}
public void clearCache()
{
	System.out.println("Clearing the cache");
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome openincogni=new Chrome();
		openincogni.openIncognito();
		openincogni.clearCache();
		openincogni.openUrl();
		openincogni.closeBrowser();
		openincogni.navigateBack();
		

	}

}
