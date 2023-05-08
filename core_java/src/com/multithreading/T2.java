package com.multithreading;


//import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.*;
public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//HashMap<K, V>
				ConcurrentHashMap<String, Integer> data = new ConcurrentHashMap<>(); //
				
				data.put("lenovo", 373);
				data.put("sony", 4455);
				data.put("asus", 8383);
				data.put("Apple", 9988);
				data.put("dell", 848);
				data.put("mac", 8883);
				data.put("sony", 7788);
				data.put("apple", 8899);
				
				System.out.println(data);
				
				data.forEach(4, (k, v) -> 
				System.out.println("Key : "+k+" Value : "+v+" Thread name : "+Thread.currentThread().getName()));		
	}

}
