package stringAlgorithm.patternMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first String");
		String s = null;
		String s1 = null;
		try {
			 s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		  s1 = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String a = s + " " + s1;
		
		System.out.println("value of 'a' is: " + a);

	}

}
