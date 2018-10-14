package io.javapractice.generalproblems;

public class WrapperClasses {
	public static void main(String[] args) {
		Integer integer=new Integer(50);
		System.out.println("Integer :"+integer +" hash code :"+integer.hashCode());
		
		Integer integer2=Integer.valueOf(50);
		System.out.println("Integer :"+integer2 +" hash code :"+integer2.hashCode());
		
		Integer integer3=new Integer(50);
		System.out.println("Integer :"+integer3 +" hash code :"+integer3.hashCode());
	}
}
