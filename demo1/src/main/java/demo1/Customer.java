package demo1;

public class Customer {
	private String firstName;
	private String lastName;
	private String email;
	
	public Customer() {	//constructor
		firstName = "Unknown";
		lastName = "Unknown";
		email = "Undefined";
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
