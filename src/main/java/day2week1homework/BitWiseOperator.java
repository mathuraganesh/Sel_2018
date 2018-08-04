package day2week1homework;

public class BitWiseOperator {

	public static void main(String[] args) {
	int a=12;
	int b=45;
	
	System.out.println(a&b);  //Binary AND Operator copies a bit to the result if it exists in both operands.
	System.out.println(a|b);  //Binary OR Operator copies a bit if it exists in either operand.
	System.out.println(a^b);  //Binary XOR Operator copies the bit if it is set in one operand but not both.
	System.out.println(~b);  //Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
	System.out.println(a<<b);  // 	Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.
	System.out.println(a>>b);  //Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
	System.out.println(a>>>b);  //Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.

	}

}
