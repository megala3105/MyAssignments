package week.day2;

public class Kia extends Car {
	
	public void kiaOptions()
	{
		System.out.println("Kia");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kia kiaoptions=new Kia();
		kiaoptions.kiaOptions();
		kiaoptions.advanceBrake();
		kiaoptions.applyBrake();

	}

}
