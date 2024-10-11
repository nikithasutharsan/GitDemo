package javaPrograms;

public class CountWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to Java Selenium Automation ";   //3words
		int count=1;
		for(int i=0;i<s.length()-1;i++) {		
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
			count++;
		}
		
		}
		System.out.println(count);
		

	}

}
