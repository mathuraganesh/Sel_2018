package day2challenge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	System.out.println("Enter the Factorial Number:");
	Scanner sGetInput=new Scanner(System.in);
	int sGetValue=sGetInput.nextInt();
	int fact=1;
	for(int i=1;i<=sGetValue;i++) {
		fact=fact*i;
	}
	System.out.println("The Factorial of the Given Number '"+sGetValue+"':"+fact);
	}

}
