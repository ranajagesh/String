package com.jaggu.stringcom.jaggu.assignment;

public class CaseEveryCharacter {

	public static void main(String[] args) {

/*		
		        String s = "jaVa";
		        String s1 = "";
		        
		        char[] a = s.toCharArray();

		        for (int i = 0; i < a.length; i++) {
//		        	char c = a[i];
//		        	if(a[i]>a[i]) {
//		        		
//		        	}
		        		
		        		
		        	if (Character.isLowerCase(a[i])) {
		        	    a[i] = Character.toUpperCase(a[i]);
		        	} else if (Character.isUpperCase(a[i])) {
		        	    a[i] = Character.toLowerCase(a[i]);
		        	} 		        	
		        }

		        String res = new String(a);

		        System.out.println("Original String: " + s);
		        System.out.println("Modified String: " + res);
		
*/
		

		        String inputString = "RamAnA";
		        String outputString = swapCase(inputString);
		        System.out.println(outputString);
		    }

		    private static String swapCase(String input) {
		        char[] charArray = input.toCharArray();

		        for (int i = 0; i < charArray.length; i++) {
		            char ch = charArray[i];

		            if (ch >= 'A' && ch <= 'Z') {
		                // Uppercase to lowercase
		                charArray[i] = (char) (ch + ('a' - 'A'));
		            } else if (ch >= 'a' && ch <= 'z') {
		                // Lowercase to uppercase
		                charArray[i] = (char) (ch - ('a' - 'A'));
		            }
		            // Ignore non-alphabetic characters
		        }

		        return new String(charArray);
		    }

}

