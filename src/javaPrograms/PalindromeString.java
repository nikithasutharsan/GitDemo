package javaPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MADAM";
		//String org_str = str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			 rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println(str+"String is Palindrome");
		}else {
			System.out.println(str+"String is not Palindrome");
		}
		

	}

}
