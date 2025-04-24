package demo2;

public class Main2 {

	public static void main(String[] args) {
		int year = 1990;
		if (year%100 == 0 && year%400==0) {
			System.out.println("Year is leap year and a century");
		}else if ( year%4 ==0 ) {
			System.out.println("Year is leap year");
		}else {
			System.out.println("Year is NOT leap year");
		}
		// Write a code to check if given number is positive or negetive
		
		/// if N < 0 THEN its negetive
		
		/// Write a code to create a Date class ?
		/// Date should have : day, month & year
		// Write a method to Validate a date object ?
		// Ex. Date d = new Date(34,11,2025); //dd-mm-yyyy
		// Ex. Date d = new Date(30,2,2025); //dd-mm-yyyy
		// validate(d); /// FALSE
	}
}
