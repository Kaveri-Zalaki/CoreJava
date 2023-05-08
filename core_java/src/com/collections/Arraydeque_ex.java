package com.collections;
import java.util.*;

public class Arraydeque_ex {

	public static void main(String[] args) {

				Deque<Integer> d= new ArrayDeque<Integer>(10);

				// add() method to insert
				
				d.add(10);
				d.add(20);
				d.add(30);
				d.add(40);
				d.add(50);

				System.out.println(d);

				// clear() method
				
				d.clear();
				d.addFirst(564);
				d.addFirst(291);

				d.addLast(24);
				d.addLast(14);
				System.out.println(d);
				
			Deque<String> dq= new ArrayDeque<String>();

						// add() method to insert
						dq.add("navya");
						dq.addFirst("masti");
						dq.addLast("kavya");

						System.out.println(dq);

						System.out.println(dq.pop());

						System.out.println(dq.poll());

						System.out.println(dq.pollFirst());

						System.out.println(dq.pollLast());
					}
			}
	