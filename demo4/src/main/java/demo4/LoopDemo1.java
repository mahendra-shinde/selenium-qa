package demo4;

public class LoopDemo1 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("do .. while");
		do {
			System.out.println("Value "+i);
			i++;
		}while(i<10);
		
		i = 10;
		System.out.println("while ...");
		while(i<10){
			System.out.println("Value "+i);
			i++;
		};
	}

}
