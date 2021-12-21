package com.createiq.demo.threadpool;

public class ThreadDemo {
	
	public static void main(String[] args) {
		PrepareDocThread prepareDocThread = new PrepareDocThread();
		for(int i=1;i<=100;i++) {
			Thread t1 = new Thread(prepareDocThread);
			t1.start();
		}
				
	}

}
