package week.day2;

public class Car extends LearnInheritence_Vehicle {
	
	public void advanceBrake()
	{
		System.out.println("Advance brake");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car caroptions=new Car();
caroptions.advanceBrake();
caroptions.applyBrake();

	}

	
}
