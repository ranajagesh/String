package com.jaggu.stringcom.jaggu.assignment;

public class DigitExist {

	public static void main(String[] args) {
		String s  ="abc124gj";
		int count = 0;
		char []a = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			
			if(c>='0' && c<='9') {
//				count = c - a[i];
//				System.out.print(c);
				count += c -'0';
				
			}
			
		}
		System.out.println(count);
		
	}

}
