package javaPrograms;

import java.util.Arrays;

public class Check2arraysequalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]= {1,2,3,4,5,6,7};
		int a2[]= {1,2,3,4,5,6,7};
		
		/*boolean status= Arrays.equals(a1, a2);
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}*/
		
		//logic without arrays function 1.check length and it should be equal 2.if length is equal then compare with logic
		
		
		boolean status=true;
		if(a1.length == a2.length) {
			
			for(int i=0; i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
			}
			
		}else {
			status=false;
		}
			
		if(status==true) {
		System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}

	}

}
