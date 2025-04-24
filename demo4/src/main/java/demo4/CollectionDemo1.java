package demo4;

import java.util.LinkedList;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// Generic Collections : List of Account objects
		List<Account> list = new LinkedList<Account>();
		list.add(new Account("SB0001", "Vishal", "vish1234@xyz.com", "Savings", 1200.40));
		list.add(new Account("SB0002", "Ajay", "aja1234@xyz.com", "Savings", 1400.40));
		
		for(Account a : list) {
			System.out.println(a.getCustName()+" Account number: "+a.getAccNum());
		}
		
	}

}
