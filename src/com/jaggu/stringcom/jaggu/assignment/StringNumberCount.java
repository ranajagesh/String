package com.jaggu.stringcom.jaggu.assignment;

public class StringNumberCount {

	public static void main(String[] args) {
		String s = "success";
		char[]a = s.toCharArray();
		int i = 0;
		String s1 ="";
		
		while(i<a.length) {
			char c = a[i];
			int count = 1;
			
			i++;
			
			while(i<a.length && a[i]==c) {
				
				count++;
				i++;
			}
			s1+=(count +""+c);
			s1= s1.replace("1", "");
			
		}
		System.out.println(s1);
		
		
	}

}
