package javaPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a*&^%$##$>?::hja hdyuh  latingjb 09856373";
		String output= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(output);
		
		
		String str="java programming    language   selenium automation    program";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		

	}

}
