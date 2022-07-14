package week1.weeklyassignments;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
        String s1 = "civic";                
        String rev = "";
        
        char[] chars = s1.toCharArray();        
        for (int i = chars.length-1; i >=0 ; i--) {
        	
        				rev = rev + chars[i];
			}
        
        boolean isMatches = s1.equalsIgnoreCase(rev);        
        if (isMatches == true) {
        	
        	System.out.print(s1+ " is Palindrome");
        	
        }else {
        	System.out.print(s1+ " is not Palindrome");
        }
    }
}
