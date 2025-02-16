package week.day2;

public class Safari extends Browser{
	
	public void readme()
	{
		System.out.println("Reading me");
	}

	public void fullScreenMode()
	{
		System.out.println("Full screenmode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Safari reading=new Safari();
reading.readme();
reading.openUrl();
reading.navigateBack();
reading.openUrl();
reading.navigateBack();
reading.fullScreenMode();

	}

}
