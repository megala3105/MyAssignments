package week1.day2;

public class LearnElseIfCondition {

	public static void main(String[] args) {
		//to check the number is positive or negative
		
		//if block will execute only if the condition is true,else it will directly go to else block
		
		int num1=0;
		int num2=-1;
		
		if (num1>0)
		{
			System.out.println("Numb1 is Positive number");
		}
			
		else if (num1==0) {
			System.out.println("The numb1 is zero");
		}
		
		else
		{
			System.out.println("Numb1 is Negative");
		}
	}

}
