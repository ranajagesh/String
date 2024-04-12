package com.jaggu.stringcom.jaggu.assignment;

public class ReverseSentenceString {

	public static void main(String[] args) {

		  /*      String s = "Java is very easy";
		        String s2 = "";
		        String[] word = s.split(" ");
		        int i = 0;
		        int j = word.length-1;
		       
		        	while(i<j) {
		            String s1 = word[i];
		            word[i] = word[j];
		            word[j] = s1;
		            i++;
		            j--;
		        }

		        String reverse = String.join(" ", word);

		        System.out.println("Original Sentence: " + s);
		        System.out.println("Reversed Sentence: " + reverse);
		        
		        */
		
		String s = "Java is a very easy";
		String s1 = "";
		
		String [] rev = s.split(" ");
		
		for(int i=rev.length-1;i>=0;i--) {
			String s2 = rev[i];
			
			s1+=s2+" ";
		}
		System.out.println(s1);
		        
	}
	
}
