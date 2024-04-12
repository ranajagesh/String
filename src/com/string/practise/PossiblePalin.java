package com.string.practise;

public class PossiblePalin {

	public static void main(String[] args) {
		String s = "banana";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPalin(s, i, j)) {
					System.out.println(i+" "+j);
					System.out.println(s.substring(i,j+1));
				}
			}
		}
		System.out.println(isPalin(s, 1, s.length()-1));
	}
	
	public static boolean isPalin(String s ,int start,int end) {
		int i=start,j=end;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
