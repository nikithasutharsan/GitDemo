package javaPrograms;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		int c=400;
		/*if(a>b && a>c) {
			System.out.println(a+"Largest number");
		}else if(b>a && b>c) {
			System.out.println(b+"Largest number");
		}else {
			System.out.println(c+"Largest number");
		}*/
		
		int large1= a>b?a:b;
		int large2= c>(large1)?c:(large1);
		System.out.println(large2);
		

	}

}
