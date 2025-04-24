package demo4;

import java.util.*;

public class CollectionDemo3 {

	public static void main(String[] args) {
		Map<String, Account> accounts = new HashMap<String, Account>();
		accounts.put("SB0001",new Account("SB0001", "Vishal", "vish1234@xyz.com", "Savings", 1200.40));
		accounts.put("SB0002", new Account("SB0002", "Ajay", "aja1234@xyz.com", "Savings", 1400.40));
		accounts.put("SB0003",  new Account("SB0003", "Kushal", "kush1234@xyz.com", "Savings", 1980.0));
		accounts.put("SB0004", new Account("SB0004", "Ayush", "ayu4@xyz.com", "Savings", 23400.0));
		accounts.put("SB0005", new Account("SB0005", "Kiran", "kiran24@xyz.com", "Savings", 18890.40) );
		
		System.out.println("Find balance in account SB0003");
		Account a = accounts.get("SB0003");
		if(a == null) {
			System.out.println("No such account exists !");
		}else {
			System.out.println("Balance in account SB0003 is "+a.getBalance());
		}

		//Get each KEY from map
		for(String accNums : accounts.keySet()) {
			Account a = accounts.get(accNums);
			System.out.println("Balance in account SB0003 is "+a.getBalance());
		}
	}

}
