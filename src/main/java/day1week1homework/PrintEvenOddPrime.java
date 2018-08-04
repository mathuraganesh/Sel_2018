package day1week1homework;

import java.util.Scanner;

public class PrintEvenOddPrime {

	public static void main(String[] args) {
	System.out.println("Enter the Number to Find the Given Number Even Or Odd");
	Scanner sVar=new Scanner(System.in);
	int sInput=sVar.nextInt();
	if(sInput%2==0) {
		System.out.println("The Given Number: "+sInput+" is Even number");
		
	}
	else {
		System.out.println("The Given Number: "+sInput+" is  Odd number");
	}
	

	}

}
