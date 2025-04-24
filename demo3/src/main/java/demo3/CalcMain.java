package demo3;

public class CalcMain {

	public static void main(String[] args) {
		System.out.println("You have provided "+ args.length +" of arguments");
		for(String s : args) {
			System.out.println(s);
		}
		// Trying to convert FIRST argument into Integer number
		int n1,n2,n3;
		
		try {
			n1 = convertNum(args[0]);
		}catch(NumberFormatException ex) {
			System.out.println("Expected a number as an argument !");
			n1 = 0;
		} 
		try {
		n2 = Integer.parseInt(args[1]);
		}catch(NumberFormatException ex) {
			System.out.println("Expected a number as an argument !");
			n2 = 0;
		}
		n3 = n1 + n2;
		System.out.println("Sum = "+n3);
		
	}

	static int convertNum(String str) throws NumberFormatException 
	{
		return Integer.parseInt(str);
	}
}
