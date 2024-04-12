// Input:” ram#123” output:”123#ram”

package com.java.stringPractice;

public class StringQ2 {

	public static void main(String[] args) {
		String s = "4rama@$n#1a23";		
		char []a = s.toCharArray();
		int len = s.length();
		String temp = "";
		String charac = "";
		String num = "";
		String special = "";
		
		for(int i=0;i<len;i++) {
			if(a[i]>='a' && a[i]<='z') {
				charac+=a[i];
			} else if(a[i]>='0' && a[i]<='9') {
				num+=a[i];
			}
			else {
				special+=s.charAt(i);
			}
		}
		temp = num+special+charac;
		System.out.println(temp);
		
	}

}
