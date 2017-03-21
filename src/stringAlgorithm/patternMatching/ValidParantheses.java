package stringAlgorithm.patternMatching;

import java.util.*;
import java.io.*;

public class ValidParantheses {

    public static void main(String[] args) throws Exception {

	Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter String: ");
   // String str = br.readLine();
	String str = sc.next();
    if(str == null) {
    System.out.println("string is null: ");
    }
    else 
    
    System.out.println(isValid(str));   
}

    public static Boolean isValid(String s) {

                int len = s.length();
                System.out.println("size of string is: "+ len);
		char[] stack = new char[len + 1];
		int top = 1;
		for (int i = 0; i < len; ++i) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{')
			{
				System.out.println("value of top before: " + top);
				stack[top++] = c;
				System.out.println("value of top is: " + top);
			}

			else if (c == ')' && stack[top - 1] != '(')
				return false;
			else if (c == ']' && stack[top - 1] != '[')
				return false;
			else if (c == '}' && stack[top - 1] != '{')
				return false;
			else
				--top;
		}
		if (top == 1)
			return true;
		return false;

}


}
