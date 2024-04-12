package com.jaggu.stringcom.jaggu.assignment;

public class CountRepeatCharacter {

	public static void main(String[] args) {
		String s = "hello world";
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			int count = 50;
			for(int j=i+1;j<c.length;j++) {
				if((c[i]>='a' && c[i]<='z')||(c[i]>='A' && c[i]<='Z')) {
					if(c[i]==c[j]) {
						c[j] = (char) count;
						count++;
					}
				}
			}
			if(count!=50) {
				c[i]='1';
			}
		}
		System.out.println(c);
	}
}
