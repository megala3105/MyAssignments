package week.day2;

public class Browser {

	public void openUrl()
	{
		System.out.println("Opening the Url");
		
	}
	
	public void closeBrowser()
	{
		System.out.println("Closing the browser");
	}
	
	public void navigateBack()
	{
		System.out.println("Navigating back");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser openurl=new Browser();
openurl.openUrl();
openurl.closeBrowser();
openurl.navigateBack();
	}

}
