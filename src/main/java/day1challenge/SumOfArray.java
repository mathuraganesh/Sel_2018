package day1challenge;

public class SumOfArray {

	public static void main(String[] args) {
	int iArray[]= {123,89,9,77,87};
	int sumValue=0;
		for(int iSum=0;iSum<=4;iSum++) {
			sumValue=sumValue+iArray[iSum];
		}
	System.out.println("The Sum of Array value:"+sumValue);

	}

}
