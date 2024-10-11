package javaPrograms;

public class SearchingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50, 60 };
		int searchele = 80;
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchele) {
				System.out.println("Element is found");
				count++;
				break;
			} 
		}
		if(count==0) {
			System.out.println("Element not found");
		}
		

	}

}
