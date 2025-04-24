package demo4;

public class LoopDemo2 {

	public static void main(String[] args) {
		int[] data = new int[] {10,20,34,45,55};
		for(int i=0; i<data.length; i++) {
			System.out.println("Data ["+i+"] - "+data[i]);
		}
		
		System.out.println("Using enhanced for loop");
		for(int x : data) { // for each value from 'data` as x
			System.out.println("data: "+x);
		}
	}

}
