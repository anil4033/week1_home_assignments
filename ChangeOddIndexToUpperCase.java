package week1.weeklyassignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test = "changeme";
		
		char[] chars = test.toCharArray();
		
		for (int i = 0; i < chars.length-1; i++) {
						
			if(i%2 == 1) {				
				
				 chars[i]= Character.toUpperCase(chars[i]);
				 System.out.print(chars[i]);
			} else {
				System.out.print(chars[i]);
			}
			
		}
		

	}

}
