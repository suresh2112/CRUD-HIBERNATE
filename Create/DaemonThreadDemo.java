package com.createiq.demo.daemon;

import java.util.Iterator;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread() {

			public void run() {
				while (true) {
					System.out.println("Daemon Thread");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		};
		System.out.println(t.isDaemon());
		
		t.setDaemon(true);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
