package week1.homeassignment;

public class Palindrome {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		String input ="121";
		char ch ;
		String output="";
		
		for(int i =0; i<= input.length()-1; i++)
		{
			 ch= input.charAt(i);	
			 
			 output = ch+output;
			// System.out.println(output);
		}
		if(input.equals(output))
		{
			System.out.println("It is a Palindrome");
			
		}
		
		else
		{System.out.println("It is not a Palindrome");
		}
		}
		
		
	}


