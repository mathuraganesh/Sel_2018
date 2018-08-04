package day2challenge;

/*Write a java program to get two input number (a and b) from user and the print the numbers from a to b in the following pattern
a) if the number is divisible by 3 print FIZZ
b) if the number is divisible by 5 print BUZZ
c)  if the number is divisible by 3 and 5 print FIZZBUZZ
d) if not divisible by 3 or 5 print the number itself
input number 8	16
output:8 FIZZ BUZZ 11 FIZZ 13 14 FIZZBUZZ 16  */

public class PrintFromAtoBFollowingPattern {

	public static void main(String[] args) {
	int n=16;
	for(int i=8;i<=n;i++) {
		if ((i%3==0)&&(i%5==0)) {
			System.out.println("FIZZBUZZ");
		}
		else if(i%3==0) {
			System.out.println("FIZZ ");
		}
		else if(i%5==0) {
			System.out.println("BUZZ");
		}
		
		else if (!(i%3==0)&&!(i%5==0)) {
			System.out.println(i);
		}
		
	}

	}

}
