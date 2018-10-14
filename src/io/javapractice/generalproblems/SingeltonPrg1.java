package io.javapractice.generalproblems;

public class SingeltonPrg1{
	
	private static SingeltonPrg1 singeltonPrg1=null;
	public int x=20;
	
	private SingeltonPrg1(){
		
	}
	
	public SingeltonPrg1(int x){
		
	}
	
	public static SingeltonPrg1 getInstance() {
		
		if(SingeltonPrg1.singeltonPrg1==null){
			singeltonPrg1=new SingeltonPrg1();
			return singeltonPrg1;
		}
		else{
			return singeltonPrg1;
		}
		
		
	}

}
