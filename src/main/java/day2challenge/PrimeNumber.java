package day2challenge;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	System.out.println("Enter the Prime Number Range:");
	Scanner sPrime=new Scanner(System.in);
	int iPrime=sPrime.nextInt();
		for(int n=2;n<=iPrime;n++) {
			boolean prime=true;
			for(int i=2;i<=n-1;i++) {
				
				if(n%i==0) {
					prime=false;
				}
			}
			if(prime==true) {
				System.out.println(n);	
			}
		}

	}

}
