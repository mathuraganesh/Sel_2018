package day2week1homework;

public class PrintLargestNumber 
{

	// Print the largest Number
	public static void main(String[] args) 
	{
		int iLarge[]= {32,-22,-99,8880};
		int iNum=iLarge[0];
		for(int iBig=0;iBig<=3;iBig++)
		{
			if(iLarge[iBig]>iNum)
			{
				iNum=iLarge[iBig];
			}
		}
		System.out.println("The Largest Number:"+iNum);
	}
}


