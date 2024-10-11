package javaPrograms;

public class CountCharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="JAVA PROGRAMMING SELENIUM AUTOMATION JAVA OOPS";
		int length=s.length();
		int replace= s.replace("A", "").length();
		int output= length-replace;
		
		System.out.println(output);

	}

}
