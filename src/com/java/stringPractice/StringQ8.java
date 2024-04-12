//input: “AssmnAN” output: A=2, s=2, m=1, n=1, N=1?
package com.java.stringPractice;

public class StringQ8 {

	public static void main(String[] args) {
		String s = "AssmnAN";
		char a[] = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			int count = 1;
			char c = a[i];
			if(c==' ') continue;
			
			for(int j=i+1;j<a.length;j++) {
				if(c==a[j]) {
					count++;
					a[j] = ' ';
				}
				
			}
			System.out.print(c+"="+count+",");
		}
	}

}
