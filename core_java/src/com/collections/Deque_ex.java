package com.collections;
import java.util.ArrayDeque; 
import java.util.Deque;

public class Deque_ex {

	public static void main(String[] args)
	{
		Deque<String> deque= new ArrayDeque<String>();


		deque.add("sanvi");
		deque.add("samanta");
		deque.add("Soumya");
		System.out.println("after adding: "+deque);
		
		deque.addFirst("swati");
		System.out.println("after adding element at first position: "+deque);
		
		deque.addLast("vinay");
		System.out.println("after adding element at last position: "+deque);
		

		deque.push("sampat");
		System.out.println("after pushing sampat: "+deque);

		// Add at the last
		deque.offer("Neha");
		System.out.println("offer method : "+deque);   //offer method will add the element at last position

		// Add at the first
		deque.offerFirst("sanvi");  
		System.out.println("offer first method: "+deque);

		System.out.println(deque + "\n");

		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing " + "first and last: " + deque);
	}
}
