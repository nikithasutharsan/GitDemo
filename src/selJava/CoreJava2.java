package selJava;

import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> a = new ArrayList<String>();
	        a.add("nikitha");
	        a.add("sutharsan");
	        a.add("Dhiyana");
	        System.out.println(a);
	        
	        for(int i=0; i<a.size();i++)
	        {
	        	System.out.println(a.get(i));
	        }
	        System.out.println("+++++++++++++");
	        for(String val:a)
	        {
	        	System.out.println(val);
	        }

	        //Check whether the item is present in arraylist
	       System.out.println(a.contains("Dhiyana"));
	}

}
