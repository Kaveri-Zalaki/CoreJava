package com.collections;

import java.util.ListIterator;
import java.util.Stack;
import java.util.Iterator;

public class stack_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Stack<String> stack = new Stack<String>();    //creating stack
//LIFO
boolean res=stack.empty();
System.out.println("perform push operation");
stack.push("Ayush");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima"); 

System.out.println("after pop operation: "+stack.pop());  

System.out.println("stack capacity is: "+stack.capacity());  

res=stack.empty();
System.out.println("is stack empty?: "+res);  

String n=stack.peek();
System.out.println("element t top position: "+n);  

int pos=stack.search("amit");
System.out.println("position of amit:"+pos);  

System.out.println("after pop operation: "+stack.size());  
stack.forEach(m->
{
	System.out.println(m);
});
	}
	}
	



