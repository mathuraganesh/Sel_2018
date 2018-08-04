package day2week2;

import java.util.Scanner;

public class ThreeUserInput {

	public static void main(String[] args) {
	System.out.println("Enter the Number1:");
	Scanner iNumber1=new Scanner(System.in);
	int sNumber1=iNumber1.nextInt();
	
	System.out.println("Enter the Number2:");
	Scanner iNumber2=new Scanner(System.in);
	int sNumber2=iNumber2.nextInt();
	
	System.out.println("Enter the Operator:");
	Scanner iOperator=new Scanner(System.in);
	String sOperator=iOperator.next();
	
	switch(sOperator) {
	case "+":
		int sSum=sNumber1+sNumber2;
		System.out.println("Sum of:"+sSum);
	break;
	case "-":
		int sDifference=sNumber1-sNumber2;
		System.out.println("Difference of:"+sDifference);
	break;
	case "*":
		int sMultiple=sNumber1*sNumber2;
		System.out.println("Multiplication of:"+sMultiple);
	break;
	case "/":
		int sdivision=sNumber1/sNumber2;
		System.out.println("Division of:"+sdivision);
	break;
	}

}
}
