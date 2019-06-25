package com.cg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Executor excutor=Executors.newSingleThreadExecutor();
		//Lambda expression [generate runtime implementation] 
		//anonymous class(Object of class is created without any name)
		Runnable r=()->System.out.println("Run method executed by "+Thread.currentThread().getName());
		//-> after arrow is the body content
		//-> before arrow parameters for the object
		excutor.execute(r);
		
	}

}
