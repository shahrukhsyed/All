package com.cg;

public class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Happy Birthday Harshita "+Thread.currentThread().getName());
		
	}
}
