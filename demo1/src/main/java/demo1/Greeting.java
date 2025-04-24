package demo1;

public class Greeting {
   public static void main(String[] args) {
	   //Variable : A named container to store data throughout application
	   String name = "Mahendra";
	   /**
	    * Eight Primitive Data types
	    * -------------------------
	    * Natural Numbers : short, int, long, byte
	    * Characters : char, byte (single char)
	    * Real numbers : float, double
	    * Boolean : boolean  
	    */
	   System.out.println("Hello WOrld");
	   byte b =  12; // -127 to +127
	   byte c =  65;
	   
	   System.out.println("Byte value : "+b);
	   System.out.println("Byte value : "+ (char) c);
	   
	   short s =  100; // Short if double in memory size than byte
	   int d = 1000;   // INT is double the size of short "4" bytes
	   long ld = 10000; /// LONG is double the size if int, "8" bytes
	   
	   float fn = 12.23F;  // Floating number use suffix "F"
	   double db = 12.23;   // No Suffix needed for double, can use "D"
	   
	   System.out.println("float value : "+fn);
	   System.out.println("double  value : "+db);
   }
}
