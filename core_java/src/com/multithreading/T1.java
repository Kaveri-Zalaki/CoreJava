package com.multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class T1 {

	public static void main(String[] args) throws Exception
	{
		
		Runnable obj = () -> {
			
				String tname = Thread.currentThread().getName();
				
				System.out.println("Thread name : "+tname);
		};
		
		obj.run();
		
		Thread t1 = new Thread(obj);
		
		t1.start();
		
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj);
		
		t2.start();
		t3.start();
		t4.start();
		
		//ExecutorService exObj = Executors.newSingleThreadExecutor();
		
		Callable<Integer> task = () -> {
			try
			{
				TimeUnit.SECONDS.sleep(1);
				return 123;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return 123;
		};
		
		ExecutorService exObj = Executors.newFixedThreadPool(5);
		
		Future<Integer> ftr = exObj.submit(task);
		
		System.out.println("Done or not : "+ftr.isDone());
		
		Integer r = ftr.get();
		
		
		System.out.println("check : "+ftr.isDone());
		
		System.out.println("Result : "+r);
		
		exObj.submit(() -> {
			String tname = Thread.currentThread().getName();
			
			System.out.println("Thread name : executors : "+tname);
		});	
	

	}

}
