package javaPrograms;

public class Swapping2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println("Before Swapping values are:"+a+" "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping values are:"+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;

	}

}
