package javaPrograms;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print 0 1 1 2 3 5 8 13 21 34
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=0;i<10;i++) {
			
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}

	}

}
