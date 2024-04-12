package com.jaggu.stringcom.jaggu.assignment;

public class CountEachCharecter {

	public static void main(String[] args) {
		
		String s = "banana";
		char[] c = s.toCharArray();
		int count = 1;
		for(int i=0;i<c.length;i++) {
			char a = c[i];
			if(a==' ') continue;
			
			
			for(int j=i+1;j<c.length;j++) {
				if(a==c[j]) {
					count++;
					c[j] = ' ';
				}
			}
			System.out.println(a+"="+count); 
		}
		
//		
//		String s1 = "success";
//		
//		while(s1.length()>0) {
//			char c = s1.charAt(0);
//			String s2 = s1.replace(c+"","");
//				int count = s1.length()-s2.length();
//				System.out.println(c+"="+count);
//				s1=s2;
//				
//			
//		}
		
	}

}
