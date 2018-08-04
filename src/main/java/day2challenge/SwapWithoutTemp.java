package day2challenge;

public class SwapWithoutTemp {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("The Value of a: "+a);
	System.out.println("The Value of b: "+b);

	}

}
