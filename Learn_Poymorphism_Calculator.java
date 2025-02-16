package week.day2;
//Static polymorphism or method overloading or static polymorphism or early binding
public class Learn_Poymorphism_Calculator {
	public void addNumbers(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public void addNumbers(int a,int b,int c)
	
	{
	System.out.println(a+b+c);	
	}
public void addNumbers(float c,float d)
{
	System.out.println(c+d);
}

	public static void main(String[] args) {
		// Addition functionality
		
		Learn_Poymorphism_Calculator calc=new Learn_Poymorphism_Calculator();
		calc.addNumbers(1, 5);
		calc.addNumbers(5, 5, 3);
		calc.addNumbers(2.5f, 1);
		
	}

}
