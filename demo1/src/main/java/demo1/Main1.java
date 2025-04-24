package demo1;

public class Main1 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		// It is legal to use Variable of type "BASE" class
		// But object of its "derived" class
		// Polymorphism 
		Customer c2 = new OverseasCustomer("United Kingdom");
		printName(c2);// c2 is an Argument

	}
	
	//Method definition
	 static void printName(Customer cx) { // cx is a parameter
		System.out.println(cx.getFirstName()+" "+cx.getLastName());
	}

}
