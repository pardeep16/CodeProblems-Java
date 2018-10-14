package io.javapractice.generalproblems;

public class AccountSync {
	static long balance=4000;
	
	synchronized public void depositAmount(long amount){
		
		
		try{
			Thread.sleep(1000);
			System.out.println(amount);
			balance=balance+amount;
			System.out.println("Balance :"+balance);		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
