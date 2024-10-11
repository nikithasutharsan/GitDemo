package javaPrograms;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Nikitha Sutharsan");
		
		String[] splitstring = s.split(" ");
		System.out.println(splitstring[0]); 
		System.out.println(splitstring[1]);
		
		//reverse string
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		
		int a[]= {100,200,300,400,500};
		
		for(int j=a.length-1;j>=0;j--) {
			System.out.println(a[j]);
		}
		
		int b=1234;
		int rev=0;
		
		while(b!=0) {
			rev=rev*10+b%10;
			b=b/10;
		}
		System.out.println(rev);
		
		int n=4795;
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer output = sb.reverse();
		System.out.println(output);
		
		String str="Dhiyana";
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer result = sb1.reverse();
		System.out.println(result);
		
		String str1="Venu";
		
		for(int q=str1.length()-1;q>=0;q--) {
			System.out.print(str1.charAt(q));
		}

	}

}
