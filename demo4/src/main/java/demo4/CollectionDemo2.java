package demo4;

import java.util.*;

public class CollectionDemo2 {

	public static void main(String[] args) {
		String[] names = new String[] {"Ramesh","Suresh","Ganesh","Ramesh","Suresh","Suresh"};
		
		List <String> list = new LinkedList<>();
		list.addAll(Arrays.asList(names)); // Add all elements from an array to List
		
		Set<String> set = new HashSet<>();
		set.addAll(Arrays.asList(names)); 
		
		System.out.println("Size of list :"+ list.size());
		for(String n : list) {
			System.out.println(n);
		}
		
		
		System.out.println("Size of set :"+ set.size());
		for(String n : set) {
			System.out.println(n);
		}
		
		
	}

}

