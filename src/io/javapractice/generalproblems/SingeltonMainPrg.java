package io.javapractice.generalproblems;

import javax.transaction.xa.Xid;

public class SingeltonMainPrg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingeltonPrg1 singeltonPrg1=SingeltonPrg1.getInstance();
		SingeltonPrg1 singeltonPrg12=SingeltonPrg1.getInstance();
		
		SingeltonPrg1 singeltonPrg13=new SingeltonPrg1(10);
		singeltonPrg1.x=singeltonPrg1.x+50;
		System.out.println(singeltonPrg1.x);
		System.out.println(singeltonPrg12.x);
		System.out.println(singeltonPrg13.x);
	}
}
