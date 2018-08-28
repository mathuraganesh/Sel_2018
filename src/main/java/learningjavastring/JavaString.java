package learningjavastring;

import java.util.ArrayList;
import java.util.Set;

public class JavaString {

	public static void main(String[] args) {
		
		/* Reverse the String
		String txt="Hello World";
		int len=txt.length();
		for(int i=len-1;i>=0;i--) {
			System.out.print(txt.charAt(i));
		}  */
		
		/*Find number of "a" in the string
		int icount=0;
		String find="mathuraveeraganesh";
		for(int i=0;i<find.length();i++) {
			char iGetCharacter=find.charAt(i);
			if(iGetCharacter=='a') {
				icount=icount+1;
			}
			
		}
		System.out.println(icount); */
		
		//String [] aSplit=find.split("a");
		//System.out.println(aSplit.length-1);
		
		/*Find the count of each char in your name 
		String count="Amazon India Private Limited";
		char[] aArray;
		for(int i=0;i<count.length();i++) {
			int icount=0;
			for(int j=0;j<count.length();j++) {
				if(count.charAt(i)==count.charAt(j)) {
					icount++;
				}
			}
			
			//aArray[i]=count.charAt(i);
			//Set<String> aArrayList=new ArrayList<String>();
			//aArrayList.add(aArray);
			System.out.println(count.charAt(i)+"-"+icount);
		} */
		
		/*Replace the every second character with UpperCase*/
		String replace="amazon";
		for(int i=1;i<=replace.length();i++) {
			String sin=replace.substring(0,i);
			if(i%2==0) {
				sin=replace.substring(i).toUpperCase();
			}
			System.out.println(sin);
		}
	}  

}
