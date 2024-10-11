package javaPrograms;

public class MaxandMinElementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {59,65,25,17,90,65};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];			}
		}
		System.out.println("Maximum number is" +max);
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum number is" +min);

	}

}
