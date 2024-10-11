package selJava;

import java.util.ArrayList;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //when we want to store/declare a value to the variable we need to mention the datatype
		int myNum=5;
		String website = "Rahul Sheety Academy";
		char letter='r';
		double dec = 5.99;
		boolean myCard = true;		
		System.out.println(website+"is the website for selenium");
	
		//Arrays
		int[] arr= new int[5]; //after creating the object we need to declare value
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,10}; //directly decalring values
        System.out.println(arr2[3]);
        
        //for loop
        for(int i=0; i<arr.length; i++)
        {
        	System.out.println(arr[i]);
        }
	
        //Enhanced for loop
        for(int s:arr2)
        {
        	System.out.println(s);
        }
        
        //Conditional for loop
        
        //print multiples of 2
        
        for(int i=0; i<arr2.length; i++)
        {
        	if(arr2[i]%2==0)
        	{
        	System.out.println(arr2[i]);
        	break; //exits when the condition is satisfied in between instead of doint the loop full
        	}
        	else
        	{
        		System.out.println(arr2[i] +"is not multiple of 2");
        	}
        }
        
        
     
        
	}

}
