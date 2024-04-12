package com.jaggu.string;

public class ListOfPalindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPalindrome(s, i, j)) {
					System.out.println("start index "+i+" Ending index "+j);
					System.out.println(s.substring(i,j+1));
					
				}
			}
		}
	}
	
	public static boolean isPalindrome(String s,int start,int end) {
		int i=start,j=end;
		
		while(i<j) {
			if(s.charAt(start)!=s.charAt(end)) return false;
			
			i++;
			j--;
		}
		return true;
	}

}
