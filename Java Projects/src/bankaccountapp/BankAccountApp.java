package bankaccountapp;



public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Umar Dealer","321456879",1500);
		
		Savings savacc1 = new Savings("Katy Smith","456657897",2500);
		
		savacc1.showInfo();
		System.out.println("************");
		chkacc1.showInfo();
		
		
		
		// Read a CSV File then create new accounts based on that data
		
	}

}
