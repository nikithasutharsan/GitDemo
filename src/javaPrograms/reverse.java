package javaPrograms;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "programming";
		int length= s.length();
		int Middle=length/2;
		
		if(length%2!=0) {
			System.out.println("The string cannot be split into half");
		}
		else {
		
		String firsthalf= s.substring(0, Middle);
		String secondhalf= s.substring(Middle);
		StringBuffer rev= new StringBuffer(firsthalf);
		StringBuffer reversestring= rev.reverse();
		
		System.out.println(reversestring+secondhalf);
		}
			
		
		
		
	}

}
