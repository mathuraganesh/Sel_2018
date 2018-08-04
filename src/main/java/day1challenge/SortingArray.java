package day1challenge;

public class SortingArray {

	public static void main(String[] args) {
		int aArray[]= {12,8,23,76,25,87};
		int iSorting=0;
		for(int i=0;i<=5;i++) {
			for(int j=i+1;j<=5;j++) {
				if(aArray[i]>aArray[j] ) {
					iSorting=aArray[i];
					aArray[i]=aArray[j];
					aArray[j]=iSorting;
				}
			}
		}
		System.out.println("The sorting of Ascending Order:");
		for(int i=0;i<=5;i++) {
			System.out.println(aArray[i]);
		}
	
		for(int i=0;i<=5;i++) {
			for(int j=i+1;j<=5;j++) {
				if(aArray[i]<aArray[j] ) {
					iSorting=aArray[i];
					aArray[i]=aArray[j];
					aArray[j]=iSorting;
				}
			}
		}
		System.out.println("The sorting of Descending Order:");
		for(int i=0;i<=5;i++) {
			System.out.println(aArray[i]);
		}
	}
}

