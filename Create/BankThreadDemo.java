package com.createiq.demo.itc;

public class BankThreadDemo {

	public static void main(String[] args) {

		Account account = new Account(100002345, "Balaji G", 30000.00);

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				account.withdraw(40000.00);
			}
		};

		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.deposite(100000.00);
			}
		};

		Thread withdraw = new Thread(runnable1);
		Thread deposite = new Thread(runnable2);
		withdraw.start();
		deposite.start();

	}

}
