package demo2;

public class DemoOperators {
	public static void main(String[] args) {
		
		// OPerators

		// Arithmetic Operators + - * /
		int num1 = 10 + 2;
		int num2 = 122 - 12;
		int num3 = 10 * 3; // Multiplication
		int num4 = 24 / 2; // Division
		
		//Relational operators who return "Boolean" values
		// < > <= >= != ==
		boolean b1 = 10 > 2; // true
		boolean b2 = 10 < 2; // false
		boolean b3 = 10 >= 2 ; //true
		boolean b4 = 2 >=2 ; // true
		boolean b5 = 2 == 3; // false
		boolean b6 = 2 != 3; // true
		
		// Logical operators 
		// && AND,  || OR
		
		boolean d1 = (10>2) && (10>5); // true
		/*
		 * TRUE && TRUE => TRUE
		 * FALSE && TRUE => FALSE
		 * TRUE && FALSE => FALSE
		 * FALSE && FALSE => FALSE
		 */
		boolean d2 = (10>2) || (10>15); // true
		/*
		 * TRUE || TRUE => TRUE
		 * FALSE || TRUE => TRUE
		 * TRUE || FALSE => TRUE
		 * FALSE || FALSE => FALSE
		 */
		
	}
}
