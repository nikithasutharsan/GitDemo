package javaPrograms;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 17846352;
		int count=0;
		
	 while(num>0){
		 num=num/10;
		 count++;			
		}
	 System.out.println(count);

	}

}