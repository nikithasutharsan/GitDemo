package javaPrograms;

public class DuplicateelementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"Java","C", "C++","Python"};
		
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Element found"+arr[i]);
					k++;
				}
			}
		}
		if(k==0) {
			System.out.println("Duplicate Element not found");
		}
		
		

	}

}
