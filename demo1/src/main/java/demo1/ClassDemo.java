package demo1;

public class ClassDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println("Name : "+c1.getFirstName()+" "+c1.getLastName());
		
		c1.setFirstName("Vishal");
		c1.setLastName("Devgan");
		
		
		System.out.println("Name : "+c1.getFirstName()+" "+c1.getLastName());
	}

}
