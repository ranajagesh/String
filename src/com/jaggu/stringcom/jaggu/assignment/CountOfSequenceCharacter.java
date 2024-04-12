package com.jaggu.stringcom.jaggu.assignment;

public class CountOfSequenceCharacter {

	public static void main(String[] args) {
		String s = "successive";
		
		char[] a = s.toCharArray();
		int i=0;
		while(i<a.length) {
			char c = a[i];
			int count = 1;
			i++;
			while(i<a.length && a[i]==c) {
				count++;
				i++;
			}
			System.out.print(count+""+c);
		}
	}

}
