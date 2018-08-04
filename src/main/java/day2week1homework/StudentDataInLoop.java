package day2week1homework;

import java.util.Scanner;

public class StudentDataInLoop {

	public static void main(String[] args) {

		//Print the Data of the Student with the For Loop
		
		String[] studentList= {"mahesh","Ganesh","Suresh"};
		int[] ageList= {23,25,27};
		char[][] gradesList= {{'A','B','C','D','E','F'},{'B','B','B','B','B','B'},{'F','F','F','F','F','F'}};
		
		for(int iList=0;iList<=2;iList++) {
			System.out.println(studentList[iList]
			+" Whose is "+ageList[iList]
			+" Years Old Scored "+gradesList[iList][0]+","+gradesList[iList][1]+","+gradesList[iList][2]+","+gradesList[iList][3]+","+gradesList[iList][4]+","+gradesList[iList][5]);
		}

	}

}
