package com.ramana.stringquestions;

public class Q35Permutation {

	public static void main(String[] args) {
		String s = "abc";
		permu(s,0,s.length()-1);
	}
	public static String swap(String s,int i,int j) {
		
		char []c = s.toCharArray();
		char a = c[i];
		c[i] = c[j];
		c[j] = a;
		return new String(c);	
	}
	public static void permu(String s,int start,int end) {
		if(start==end) {
			System.out.println(s);
			return;
		}
		
		for(int i=start;i<=end;i++) {
			String s1 = swap(s,start,i);
			permu(s1,start+1,end);
		}
	}

}
