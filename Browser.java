package week2.day1.classroomactivity;

public class Browser {
	
	public String launchBrowser(String s)
	{
	//System.out.println("Browser launched successfully");
		return s;
	}
	
	public void launchUrl()
	{
		System.out.println("launch url");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser chrome=new Browser();
System.out.println(chrome.launchBrowser("Launch Chrome Browser"));

chrome.launchUrl();
	}

}
