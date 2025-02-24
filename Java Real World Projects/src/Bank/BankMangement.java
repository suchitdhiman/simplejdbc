package Bank;

import java.io.IOException;

public class BankMangement {
	public static void main(String[] args) throws IOException {
		System.err.println(System.in.read());
		
		BankAccount ss = new BankAccount();
		BankAccount kk = new BankAccount();
		
		ss.accountHolderName = "suhcit Kumar";
		ss.accountNumber = 250201100;
		ss.amount = 2000;
		ss.bankName = "State of Bank";
		ss.branch = "Aamki";
		ss.ifsc = "SA01";
		
		kk.accountHolderName = "Kumar Koustub";
		kk.accountNumber = 250201101;
		kk.amount = 2000;
		kk.bankName = "State of Bank";
		kk.branch = "Aamki";
		kk.ifsc = "SA01";
		
		System.out.println(ss.accountHolderName);
		System.out.println(ss.accountNumber);
		System.out.println(ss.amount);
		System.out.println(ss.bankName);
		System.out.println(ss.branch);
		System.out.println(ss.ifsc);
		
		
		int a = Integer.parseInt("12");
		System.out.println(args[0]);
		System.out.println(args[5]);
		System.out.println(args[20]);
		
	
		
		
		
	}

}
