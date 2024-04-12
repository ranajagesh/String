package com.jaggu.stringcom.jaggu.assignment;

public class ReverseSentences {

	public static void main(String[] args) {
		String s = "java is a pure object oriented programming language";
		String [] arr = s.split(" ");
		String s1 = "";
		
		for(int i=0;i<arr.length;i++) {
			s1+= rev(arr[i]);
			if(i<arr.length-1) {
				s1+=" ";
			}
		}
		System.out.println(s1);
	}
	
	static String rev(String s) {
		char[] a = s.toCharArray();
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		return new String(a);
	}

}
