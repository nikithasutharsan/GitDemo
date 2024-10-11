package javaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial number--for number 5---5*4*3*2*1=120 or 1*2*3*4*5=120
		
		int num=5;
		long factorial=1;
		
		//Acsending 1*2*3*4*5
		/*for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);*/
		
		//decending--5*4*3*2*1
		for(int i=num; i>0;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
