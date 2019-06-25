package com.cg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task1=()->System.out.println("th1 Service pattern Run method executed by "+Thread.currentThread().getName());
		Runnable task2=()->System.out.println("th2 Service pattern Run method executed by "+Thread.currentThread().getName());
		Runnable task3=()->System.out.println("th3 Service pattern Run method executed by "+Thread.currentThread().getName());
		
		ExecutorService executor=Executors.newFixedThreadPool(8);
		executor.execute(task1);//automatic thread object and start thread and execute
		executor.execute(task2);
		executor.execute(task3);
		
		executor.shutdown();//mandatory to be executed ,else program will not stop.
	}

}
