package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
		
public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new HashMap<>();  
    //Adding elements to map  
		    map.put(1,"Amit");  
		    map.put(5,"Rahul");  
		    map.put(2,"Jai");  
		    map.put(6,"Amit");  
		    //Traversing Map  
		    Set set=map.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		    	
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		        }
		    }  
		}  
	

