// Input:” ash123” output: 6
package com.java.stringPractice;

public class StringQ6 {

	public static void main(String[] args) {
		String s = "ash1234";
		char[] c = s.toCharArray();
		
		String s1 = "";
		int sum = 0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0' && c[i]<='9') {
				sum+=c[i]-48;
			}
		}
		System.out.println(sum);
	}

}
