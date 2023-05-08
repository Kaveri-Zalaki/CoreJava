package com.collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();  //creating HashSet
		
		set.add("Rani");  
		set.add("Vini");  
		set.add("Rani");  
		set.add("jay"); 
		
		//Traversing elements  
		Iterator<String> itr=set.iterator(); 
		System.out.println("HashSet result:");
		while(itr.hasNext()){  
				System.out.println(itr.next());  
		}  
		
		System.out.println();
		
		
		}  
		}  
	
	

