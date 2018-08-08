package io.javapractice.hackerrank;

import java.util.Scanner;

/*
 * Problem Descrition
 * Author :- Pardeep
 */

/*Java's System.out.printf function can be used to print formatted output.
 *The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor;
you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/
public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        String strArr[]=new String[3];
        int intarr[]=new int[3];
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                strArr[i]=s1;
                intarr[i]=x;   
            }
            System.out.println("================================");
            for(int j=0;j<3;j++){
                String str1=String.format("%1$-15s",strArr[j]);
                String intStr="";
                if (intarr[j]<9){
                    intStr+="00"+intarr[j];
                }
                else if(intarr[j]>9 && intarr[j]<99){
                    intStr+="0"+intarr[j];
                }
                else {
                    intStr+=""+intarr[j];
                }
               System.out.println(str1+intStr);
            }
            System.out.println("================================");

    }
    
}