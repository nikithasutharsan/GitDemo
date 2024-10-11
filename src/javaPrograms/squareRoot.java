package javaPrograms;

public class squareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num=16;
		double temp=num/2;
		double sr=0;
		
		do {
			sr=(temp+(num/temp))/2;
			
		}while(num!=0);
		
		System.out.println(sr);

	}

}
