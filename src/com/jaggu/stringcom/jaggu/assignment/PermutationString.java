package com.jaggu.stringcom.jaggu.assignment;

public class PermutationString {

	public static void main(String[] args) {
		String s = "abcd";
		display(s, 0, s.length()-1);
	}
	static void display(String s,int start,int end) {
		if(start==end) {
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++) {
			String s1 = swap(s,start,i);
			display(s1,start+1,end);
		}
	}
	
	static String swap(String s,int i,int j) {
		char[] a= s.toCharArray();
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
		return new String(a);
	}

}
