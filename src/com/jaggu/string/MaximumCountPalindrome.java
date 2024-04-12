package com.jaggu.string;

public class MaximumCountPalindrome {

	public static void main(String[] args) {
		String s = "banana";
		String res = "";
		int count = 0;
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPlind(s, i, j)) {
					count++;
					String temp = s.substring(i, j+1);
					if(res.length() < temp.length()){
						res = temp;
						
					}
				}
			}
		}
		System.out.println("Maximum Count "+count +" Palindrome String: " +res);
		//System.out.println(res);
	}
	
	public static boolean isPlind(String s,int start,int end) {
		String a =  s.toLowerCase();
		
		int i=start,j=end;
		while(i<j) {
			if(a.charAt(i)!=a.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
