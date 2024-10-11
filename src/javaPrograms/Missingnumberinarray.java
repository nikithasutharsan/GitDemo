package javaPrograms;

public class Missingnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to find missing-> no duplicates and its not needed to be sorted order, it can be jumbled and should be in range
		int a[]= {1,2,3,4,5,7,8,9,10};
		//find sum1= sum of elements, sum2=sum of elements within the range, missing number=sum2-sum1
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in array:" +sum1);
		
		int sum2=0;
		for(int i=1;i<=10;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum of elements in range:" +sum2);
		
		int sum=sum2-sum1;
		System.out.println("Missing number:" +sum);

	}

}
