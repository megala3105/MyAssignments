package week2.day1;

public class LearnAccess1 {
	
	//Banking project
	//Deposit amount-public
	//Withdraw amount-Account holder
	
	public void depositAmount()
	{
		System.out.println("Deposit amount");
	}
	
	private void withdrawAmount() {
		// TODO Auto-generated method stub
System.out.println("Withdrawn amount");
	}
	 void knowsAtm() {
		// TODO Auto-generated method stub

	}
	

	public static void main(String[] args) {
		LearnAccess1 bank=new LearnAccess1();
		bank.depositAmount();
		bank.withdrawAmount();
		bank.knowsAtm();

	}

}
