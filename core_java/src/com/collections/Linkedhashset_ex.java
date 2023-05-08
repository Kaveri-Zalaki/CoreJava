package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  //creating LinkedHashSet
		// It maintains the insertion order and permits null elements.
		System.out.println("perform some operations on LinkedHashSet ");
		set1.add("Rani");  
		set1.add("Vini");  
		set1.add("Rani");  
		set1.add("jay");  
		
		Iterator<String> itr1=set1.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		System.out.println();
		
		System.out.println("Size of Linkedhasset = "+set1.size());
		System.out.println("removing Rani from linkedhashset: "+set1.remove("Rani"));
		System.out.println("checking if the element is present:"+set1.contains("Rani"));
		
		System.out.println("updated linkedhashset:"+set1);
		
	}

}
