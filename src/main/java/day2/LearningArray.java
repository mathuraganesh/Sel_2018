package day2;

import java.util.Scanner;

public class LearningArray {

	
		public static void main(String[] args) {
			
			String[] studentList= {"mahesh","Divya","Suresh"};  //Comment by ganesh
			int[] ageList= {23,25,27};
			char[][] gradesList= {{'A','B','C','D','E','F'},{'B','B','B','B','B','B'},{'F','F','F','F','F','F'}};
			Scanner scr=new Scanner(System.in);
			System.out.println("Enter the Index");
			int aIndex=scr.nextInt();
			aIndex=aIndex-1;
			System.out.println(studentList[aIndex]
			+" Whose is "+ageList[aIndex]
			+" Years Old Scored "+gradesList[aIndex][0]+","+gradesList[aIndex][1]+","+gradesList[aIndex][2]+","+gradesList[aIndex][3]+","+gradesList[aIndex][4]+","+gradesList[aIndex][5]);
	

	}

}
