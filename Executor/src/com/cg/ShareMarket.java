package com.cg;

import java.util.concurrent.Callable;

public class ShareMarket implements Callable<Double>{
	@Override
	public Double call() throws Exception{
		double price=Math.random()*1000.0;
		return price;
	}
}
