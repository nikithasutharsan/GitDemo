package javaPrograms;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50, 60, 20, 20, 20, 20 };
		int searchele = 20;
		int count=0;
				
		for(int value:a) {
			if(value==searchele) {
				count++;
			}
		}
		System.out.println(count);

	}

}
