//maximum occurrence character in a string
// i/o ramana o/p a=3;
package com.ramana.stringquestions;

public class Q12MaxOcc {

	public static void main(String[] args) {
		String s = "ramana";
		char[]a = s.toCharArray();
		int max= 1;
		char c1 = ' ';
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			if(c>='a' && c<='z') {
			
				int count = s.length()-s.replace(c+"", "").length(); 
				if(max<count) {
					max=count;
					c1 =a[i];
				}
					
			}			
		}
		System.out.println(c1+"="+max);
		
	}

}
