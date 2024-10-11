package javaPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,6,8,3,9};
		int searchele= 100;
		boolean flag=false;
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]==searchele) {
				System.out.println("Element found");
				flag= true;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
		
		

	}

}
