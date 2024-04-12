package com.string.practise;

public class PalindromCount {

	public static void main(String[] args) {
		String s = "BAnaNa";
		String result ="";
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPalin(s, i, j)) {
					count++;
					String temp = s.substring(i, j+1);
					System.out.println(temp);
					if(result.length()<temp.length()) {
						result=temp;
					}
				}
			}
		}
		System.out.println(count+" "+result);
	}
	
	public static boolean isPalin(String s1,int start,int end) {
		String s = s1.toLowerCase();
		int i=start,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
