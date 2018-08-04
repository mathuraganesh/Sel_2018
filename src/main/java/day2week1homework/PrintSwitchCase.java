package day2week1homework;

import java.util.Scanner;

public class PrintSwitchCase {

	public static void main(String[] args) {
	System.out.println("Enter the Test Case Number:");
	Scanner sCase=new Scanner(System.in);
	String sTestCase=sCase.nextLine();
	switch(sTestCase) {
	case "1":
		System.out.println("Test Case is Pass");
	break;
	case "2":
		System.out.println("Test Case is Fail");
	break;
	case "3":
		System.out.println("Test Case is Block");
	break;
	default:
		System.out.println("Test Case is Invalid");
	}

	}

}
