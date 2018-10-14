package io.javapractice.generalproblems;

public class StringEquals {
	
	public static void main(String[] args){
		String s1="pardeep",s2="pardeep";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		StringBuilder stringBuilder=new StringBuilder("pardeep");
		StringBuilder stringBuilder2=new StringBuilder("pardeep");
		
		System.out.println(stringBuilder==stringBuilder2);//false
		System.out.println(stringBuilder.equals(stringBuilder2));//false
		System.out.println(stringBuilder.toString().equals(stringBuilder2.toString()));//true
		
		StringBuffer stringBuffer=new StringBuffer("pardeep");
		StringBuffer stringBuffer2=new StringBuffer("pardeep");
		
		System.out.println(stringBuffer==stringBuffer2);//false
		System.out.println(stringBuffer.equals(stringBuffer2));//false
		System.out.println(stringBuffer.toString().equals(stringBuffer2.toString()));//true
		
		String string1=new String("pardeep");
		String string2=new String("pardeep");
		
		System.out.println(string1==string2);//false
		System.out.println(string1.equals(string2));//true
	}

}
