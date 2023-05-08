package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set2=new TreeSet<String>();  //creating TreeSet
		//The elements in TreeSet stored in ascending order.
		System.out.println("TreeSet result");
		set2.add("Ravi");  
		set2.add("Vini");  
		set2.add("Ravi");  
		set2.add("Ajay");  
		//traversing elements  
		Iterator<String> itr2=set2.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		
	}

}
