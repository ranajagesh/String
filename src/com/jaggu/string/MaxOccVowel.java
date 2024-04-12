package com.jaggu.string;

public class MaxOccVowel {

	public static void main(String[] args) {
		String str = "voweeeele";
		
		System.out.println(maxVowels(str));
		
	}
	
	static int maxVowels(String str) {
		int curVowel = 0;
		int  maxCount =0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char c  = str.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				curVowel++;			
				if(curVowel>maxCount) {
					maxCount=curVowel;
				}
			} 
			else {
				//curVowel = 0;
			}
			
		}
		return maxCount;
	}

}
