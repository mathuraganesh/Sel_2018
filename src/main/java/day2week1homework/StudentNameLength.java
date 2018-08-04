package day2week1homework;

public class StudentNameLength {

	public static void main(String[] args) {
		
		//Print the All the Student Name and Length ,Age Using For Each Loop
		
		String[] studentlist= {"Guna","Mathuraveeraganesh","Vignesh","Rakesh"};
		int[] agedetails= {22,23,24,27};
		
		for(String list:studentlist) {
			System.out.println("Student Name: "+list+",Length of the Name: "+list.length());
		}
		
		for(int details:agedetails) {
			System.out.println("Student Age: "+details);
		}

	}

}
