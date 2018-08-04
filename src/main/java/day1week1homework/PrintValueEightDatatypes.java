package day1week1homework;

public class PrintValueEightDatatypes {

	public static void main(String[] args) {
	int minByte=-128;
	int maxByte=127;
	int minShort=-32768;
	int maxShort=32767;
	String minInt="-2,147,483,648";
	String maxInt="2,147,483,647";
	String minLong="-9,223,372,036,854,775,808";
	String maxLong="9,223,372,036,854,755,807";
	String minFloat="3.4e−038";
	String maxFloat="3.4e+038";
	String minDouble="1.7e−308";
	String maxDouble="1.7e+038";
	String minChar="‘u0000’ (or 0)";
	String maxChar="‘uffff’ (or 65,535)";
	String Boolean="true or false";
	
	System.out.println("Byte Range:"+minByte+" to "+maxByte);
	System.out.println("Short Range:"+minShort+" to "+maxShort);
	System.out.println("Int Range:"+minInt+" to "+maxInt);
	System.out.println("Long Range:"+minLong+" to "+maxLong);
	System.out.println("Float Range:"+minFloat+" to "+maxFloat);
	System.out.println("Double Range:"+minDouble+" to "+maxDouble);
	System.out.println("Char Range:"+minChar+" to "+maxChar);
	System.out.println("Boolean States:"+Boolean);
	

	}

}
