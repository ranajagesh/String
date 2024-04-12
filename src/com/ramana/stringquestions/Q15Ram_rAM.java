package com.ramana.stringquestions;

public class Q15Ram_rAM {

	public static void main(String[] args) {
		String s = "RaMaNa";
		char[]c = s.toCharArray();
		String str = "";
		
		for(int i=0;i<c.length;i++) {
			char a = c[i];
			if(a>='a'&& a<='z') {
				
			}
			if(c[i]>='A' && c[i]<='Z') {
				str+=a;
			}
		}
		System.out.println(str);
	}

}
