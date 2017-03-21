package stringAlgorithm.patternMatching;

/**
 *  This is an implementation of Longest common prefix (LCP).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMatching {

	public static void main(String[] args) throws IOException {
		
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 System.out.println("enter first String: ");
	 String firstString = br.readLine();
	 System.out.println("enter second String: ");
	 String secondString = br.readLine();
	 
	 stringMatchLength(firstString, secondString);
	 
	 System.out.println("longest common prefix is: " + stringMatchLength(firstString, secondString));
	 
	}
	
	public static int stringMatchLength(String s1, String s2) {
		
		int n = Math.min(s1.length(), s2.length());
		
		for(int i = 0; i < n; i++)
			if(s1.charAt(i) != s2.charAt(i))
				return i;
		return n;
	}
	

}
