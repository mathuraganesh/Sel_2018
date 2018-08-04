package day1week1homework;

public class ArithematicOperation {
	
	int number1=20;
	int number2=25;
	int quotient;
	public void Addition() {
		System.out.println(number1+number2);
	}
	public int Subtraction() {
		System.out.println(number1-number2);
		return 0;
	}
	public int Multiple() {
		System.out.println(number1*number2);
		return 0;
	}
	public void MultipleNumberOneByTwo() {
		System.out.println(number2*2);
		
	}
	public int DivideNumberTwoBy(int divident) {
		quotient=number2/divident;
		System.out.println(quotient);
		return quotient;
	}

}
