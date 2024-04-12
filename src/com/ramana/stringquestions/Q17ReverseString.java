package com.ramana.stringquestions;

public class Q17ReverseString {

	public static void main(String[] args) {
		String s = "avaJ si a yrev ysae egaugnal";
		String []arr = s.split(" ");
		String s1 = "";
		for(int i=0;i<arr.length;i++) {
			s1+=reverse(arr[i]);
			if(i<arr.length-1) {
				s1+=" ";
			}
		}
		System.out.println(s1);
		
	}
	
	public static String reverse(String s) {
		char[]a = s.toCharArray();
		int i=0,j=a.length-1;
		
		while(i<j) {
			char c = a[i];
			a[i] = a[j];
			a[j] = c;
			i++;
			j--;
		}
		return new String(a);
	}

}
