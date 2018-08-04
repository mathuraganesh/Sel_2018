package day1challenge;

public class SecondSmallestNo {

	public static void main(String[] args) {
	int iSmall[]= {123,89,9,77,87};
	int minValue;
		for(int iFirst=0;iFirst<=4;iFirst++) {
			for(int iSecond=iFirst+1;iSecond<=4;iSecond++) {
				if(iSmall[iFirst]>iSmall[iSecond]) {
					minValue=iSmall[iFirst];
					iSmall[iFirst]=iSmall[iSecond];
					iSmall[iSecond]=minValue;
				}
			}
		}
	System.out.println("The second Smallest No:"+iSmall[1]);

	}

}
