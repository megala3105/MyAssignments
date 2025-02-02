package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Operators
		//Assignment operator
		//Arithmetic operators
		//Comparison operators
		//Logical operators
		//Increment or Decrement operator
		
		
		//Assignment operator(=) assigning value
		System.out.println("------Assignment operator------------");
		int num=10;
		String training="This is my java training class";
	    System.out.println(training);
	    
		
		//Arithmetic operator(Add,Sub,Mul,div,mod)
		
		//Add (+)
		
		int a=10;
		int b=5;
		System.out.println("---Arithmetic operators------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		
		
		//comparison operators
		//Return boolean values(True or false)
		// equal to (==)
		//not equal to(!=)
		//greater than(>)
		//less than(<)
		//less than or equal to (<=)
		//greater than or equal to (>=)
		
		int c=4;
		int d=8;
		System.out.println("-----Comparison operators-------");
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c<d);
		System.out.println(c>d);
		System.out.println(c<=d);
		System.out.println(c>=d);
		
		//Logical operators
		//And operator(&&)
		//Cond1 and cond2 both should be true
		
		//OR operator(||)
		//cond1 or cond2 any one condition is true
		
		int r=4;
		int s=8;
		System.out.println("----Logical Operators-----");
		
		System.out.println(r<s&&r>s );
		System.out.println(r>s&&s>r);
		
		System.out.println(r<s||r>s );
		System.out.println(r>s||s>r);
		
		int x=1;
		System.out.println("----Post Increment-----");
		System.out.println(x++);//increment by 1 in next iteration;1
		System.out.println(x);//2
		System.out.println("------Preincrement------");
		System.out.println(++x);//increments by 1 in the current iteration//3
		System.out.println(x);//3
		
		System.out.println("--------Post decrement--------");
		System.out.println(x--);//3
		System.out.println(x);//2
		
		System.out.println("-----pre decrement-----");
		System.out.println(--x);//1
		
		
		
		
		
				
		
		

	}

}
