package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
	
	LinkedList<String> ll=new LinkedList<String>();  //creating LinkedList
	System.out.println("add elements to a linkedlist:");
	
	ll.add("Ravi");  
	ll.add("Vijay");  
	ll.add("Ravi");  
	ll.add("Ajay");  
	System.out.println("after adding some elements"+ll);
	
	ll.addFirst("sanvi");
	System.out.println("after adding element to the first position"+ll);
	
	ll.addLast("sampat");
    System.out.println("after adding elemt at last position: "+ll);
    
    ll.remove("Ravi");
    System.out.println("after removing Ravi elemnt from list: "+ll);
    
    LinkedList<String> ll2=new LinkedList<String>(); //creating new LinkedList
    System.out.println("adding elemnts to the new linkedlist");
    ll2.add("soumya");
    ll2.add("nidhi");
    
    ll.addAll(ll2);
    System.out.println("updated list: "+ll);
    
    ll.removeAll(ll2);
    System.out.println("after removing all:"+ll);
    
    ll.removeFirst();
    System.out.println("after removing first element: "+ll);
    
    ll.removeFirstOccurrence("Ravi");
    System.out.println("after removing first occurrence: "+ll);
    
    ll.removeLastOccurrence("Ravi");
    System.out.println("after removing last occurrence: "+ll);
    
    
    System.out.println("after applying iterator method:");
	
	Iterator<String> itr1=ll.iterator();  
	while(itr1.hasNext()){  
		System.out.println(itr1.next());  


	}  
	System.out.println("after applying descending iterator method"); //reverses
	Iterator<String> itr=ll.descendingIterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	
	ll.clear();
	
	System.out.println("after clear: "+ll);
	}
}
