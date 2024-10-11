package javaPrograms;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime numbers are greater than 1 and divisible by 1 and that number itself---19--divisible by 1 and 19 only--1 and 19 are factors
		int num= 114;
		int count=0; //how many factors 
		
		if(num>1) {
			
			for(int i=1; i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Its a Prime number");
			}
			else {
				System.out.println("Not a Prime number");
			}
			
		}else {
			System.out.println("Not a prime number");
		}
	}

}
