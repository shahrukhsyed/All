package com.cg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new MyRunnable();
		Executor excutor=Executors.newSingleThreadExecutor();
		excutor.execute(r);
		excutor.execute(r);
		excutor.execute(r);
		
	}

}
