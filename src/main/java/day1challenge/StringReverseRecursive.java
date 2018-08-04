package day1challenge;

import java.util.Scanner;

public class StringReverseRecursive {
	String sReverse="";
	public String RecursiveReverse(String inputstr) {
		if(inputstr.length()==1) {
			return inputstr;
			
		}
		else {
			sReverse=sReverse+inputstr.charAt(inputstr.length()-1)+RecursiveReverse(inputstr.substring(0, inputstr.length()-1));
			return sReverse;
		}
	}
	
	public static void main(String[] args) {
	System.out.println("Enter the String To Reverse:");
	Scanner sString=new Scanner(System.in);
	String sReverseInput=sString.nextLine();
	StringReverseRecursive obj=new StringReverseRecursive();
	System.out.println("Given string:"+sReverseInput);
	System.out.println("Reverse string:"+obj.RecursiveReverse(sReverseInput));

	}

}
