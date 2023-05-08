
package com.collections;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

public class c1 {


public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  //Creating arrayList 
System.out.println("ArrayList result");
list.add("Ravi");   //Adding object in arrayList  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
list.add(1, "Savita");
list.addAll(list);
list.contains("Ajay");
//Traversing list through Iterator 
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
System.out.println();
ArrayList<String> list1=(ArrayList<String>) list.clone();
System.out.println("list1 elements:"+list1);

System.out.println();


}
}  


