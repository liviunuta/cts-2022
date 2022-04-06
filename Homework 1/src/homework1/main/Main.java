package homework1.main;

import homework1.stage2.Account;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Account account = new Account (5000, 25, 2);
	
		System.out.println("Account details are:");
		System.out.println(account.showAccountDetails());
		
	}


}
