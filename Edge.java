package week.day2;

public class Edge extends Browser {
	
	public void takeScreenshot()
	{
		System.out.println("Taking screenshot");
	}
public void clearingCookies()
{
	System.out.println("Clearing the cookies");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Edge takess=new Edge();
takess.takeScreenshot();
takess.openUrl();
takess.closeBrowser();
takess.navigateBack();
	}

}
