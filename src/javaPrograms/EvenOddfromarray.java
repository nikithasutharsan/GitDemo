package javaPrograms;

public class EvenOddfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,1,7,9,5,6,3,4,7,8};
		
		
		//even
		System.out.println("Even numbers in an array.....");
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
				
		}
		
		System.out.println("Odd numbers in an array.....");
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
				
		}

	}

}
