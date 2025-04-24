package demo1;
// The below statement is IMPLICITE for all .Java files
import java.lang.*;
public class StringDemo {

	public static void main(String[] args) {
		String str = "Mahendra";
		
		System.out.println("Length of string: "+str.length());
		System.out.println("Substring: "+str.substring(3,5));

		String paragraph = "The quick brown fox jumps over the lazy dog.";
		System.out.println("Does it contain 'dog' ? "
				+ paragraph.contains("dog"));
		System.out.println("Does it contain 'Fox' ? "
				+ paragraph.contains( "Fox".toLowerCase() ));
		
		

	}

}
