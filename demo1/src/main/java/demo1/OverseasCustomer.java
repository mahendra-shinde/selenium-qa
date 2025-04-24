package demo1;

//Inheritance, base class = customer and derived class = OverseasCustomer
public class OverseasCustomer extends Customer{
	private String country;

	public OverseasCustomer() {
		super();	// Invoke the BASE class 'customer' constructor
		this.country = "none";
	}

	public OverseasCustomer(String country) {
		super();
		this.country = country;
	}

	public OverseasCustomer(String firstName, String lastName, String email, String country) {
		super();
		this.country = country;
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}
		
}
