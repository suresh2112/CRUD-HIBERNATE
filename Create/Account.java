package com.createiq.demo.itc;

public class Account {

	private long acno;
	private String aname;
	private double abal;
	
	
	

	public Account(long acno, String aname, double abal) {
		super();
		this.acno = acno;
		this.aname = aname;
		this.abal = abal;
	}

	public synchronized void withdraw(double amount) {

		System.out.println("Withdraw start...");

		if (abal < amount) {
			System.out.println("in sufficent balance need to wait until deposite amount");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(amount + " Rupees withdrawn successfully...");
		abal = abal - amount;
		System.out.println("Your acount balance is : " + abal);

		System.out.println("Withdraw End...");
	}

	public synchronized void deposite(double amount) {
		System.out.println("deposite start...");
		abal = abal + amount;
		System.out.println(amount + " Rupees deposited successfully...");
		System.out.println("Your acount balance is : " + abal);
		System.out.println("deposite End...");
		notify();
	}

}
