package javaPrograms;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 12391;
		int num=a;
		int rev=0;
		while(a!=0) {
			rev=rev*10 + a%10;
			a=a/10;
		}
		if(num==rev) {
			System.out.println(num+"Number is Palindrome ");
		}else {
			System.out.println(num+"Number is not Palindrome ");
			
		}
		
	}

}
