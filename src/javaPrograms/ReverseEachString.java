package javaPrograms;

public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to JAVA Selenium Automation";
		
		String[] words= s.split(" ");
		String revstring="";
		
		for(String w:words) {
			
			String revword="";
			for(int i=w.length()-1;i>=0;i--) {
				revword = revword+w.charAt(i);				
			}
			revstring=revstring+revword+" ";
			
		}
		System.out.println(revstring               );

	}

}
