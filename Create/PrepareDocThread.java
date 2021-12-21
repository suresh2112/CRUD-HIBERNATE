package com.createiq.demo.threadpool;

public class PrepareDocThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Prepare doc...");
	}

}
