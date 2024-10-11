package javaPrograms;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 30, 20, 50, 16, 49, 24, 8, 30, 67 };

		/*System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(a));

		String s[] = { "dog", "dan", "door", "dab" };
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(s));

		Arrays.sort(s);

		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(s));*/
		
		//Bubble sort---compare first and second element and if first>second, swap
		
		System.out.println("Before sorting: " +Arrays.toString(a));
		
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
			
		}
		System.out.println("Array after sorting: "+Arrays.toString(a));

	}

}
