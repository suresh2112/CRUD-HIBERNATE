package com.createiq.demo.threadpool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeShedulerThread {
	
	public static void main(String[] args) {
		
		
		Thread t = new Thread() {
			@Override
			public void run() {
				while(true) {
					SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
					Date date = new Date();
					String time = formatter.format(date);
					System.out.println(time);
					if(time.equals("09:35:00")){
						System.out.println("Send Email");
					}
				}
			}
		};
		t.start();
	}

}
