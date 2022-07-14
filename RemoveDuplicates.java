package week1.weeklyassignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		String str = "We learn java basics as part of java sessions in java week1";
		int count= 0;
		
		String[] strarr = str.split("\\s");
		
		for (int i = 0; i < strarr.length; i++) {
			for (int j = 0; j < strarr.length; j++) {
				
				if(strarr[i].equalsIgnoreCase(strarr[j])){
					count++;
				}
					if(count >1) {
						
						str = str.replace(strarr[j]," ");
			    	}
				}	
			count = 0;			
			}		
			System.out.print(str);
		}
		
	}	


