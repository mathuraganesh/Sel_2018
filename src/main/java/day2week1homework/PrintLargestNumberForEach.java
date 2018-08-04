package day2week1homework;

public class PrintLargestNumberForEach 
{

	// Print the largest Number
	public static void main(String[] args) 
	{
		int iLarge[]= {32,-22,99799,8880};
		int iNum=iLarge[0];
		for(int iBig:iLarge)
		{
			if(iBig>iNum)
			{
				iNum=iBig;
			}
		}
		System.out.println("The Largest Number:"+iNum);
	}
}


