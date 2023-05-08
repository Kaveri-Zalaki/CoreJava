package com.collections;

import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();   //creating vector
		System.out.println("Vector result");
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("gagan");  
		v.addElement("namita");
		v.addElement("swapna");
		v.addElement("vani");
		System.out.println("elemts are: "+v);

		System.out.println("size is: "+v.size());

		System.out.println("default capacity is: "+v.capacity());
		if(v.contains("namita")) {
			System.out.println("element present at position: "+v.indexOf("namita"));

		}
		else {
			System.out.println("elemt is not present in the list");

		}

		System.out.println("the first element of the vector is: "+v.firstElement());

		System.out.println("the first element of the vector is: "+v.lastElement());

		System.out.println("the first element of the vector is: "+v.removeElement(4));

	

	}

}
