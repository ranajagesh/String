//AssmnAN o/p A=2,s=2,m=1,n=1,N=1
package com.ramana.stringquestions;

public class Q8 {
	public static void main(String[] args) {
		String s = "AssmnAN";
		char a[] = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			int count =1;
			if(c==' ') continue;
			
			for(int j=1+i;j<a.length;j++) {
				if(c==a[j]) {
					count++;
					a[j] = ' ';
				}
			}
			System.out.println(c+" = "+count);
		}
	}
}
