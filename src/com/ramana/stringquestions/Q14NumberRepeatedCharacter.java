//input: helloworld output: he121w2r3d
package com.ramana.stringquestions;

public class Q14NumberRepeatedCharacter {

	public static void main(String[] args) {
		String s = "hello world";
		char []a = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			int count = '2';
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>='a'&&a[i]<='z'||a[i]>='A'&& a[i]<='Z') {
					if(a[i]==a[j]) {
						a[j] = (char) count;
						count++;
					}
				}
			}
			if(count!='2') a[i] = '1';
		}
		System.out.println(a);
	}

}
