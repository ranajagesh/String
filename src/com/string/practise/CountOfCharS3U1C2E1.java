package com.string.practise;

public class CountOfCharS3U1C2E1 {

	public static void main(String[] args) {
		String s = "AssmnAN";
		char[]a = s.toCharArray();	
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			if(c==' ') continue;
			int count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(c==a[j]) {
					count++;
					a[j] = ' ';
				}
			}
			System.out.println(c+" = "+count);
		}
	}

}
