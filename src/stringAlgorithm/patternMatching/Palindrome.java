package stringAlgorithm.patternMatching;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by vikas on 10/14/16.
 */
public class Palindrome {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String: ");

        


        StringBuffer sb = new StringBuffer("pets tell abe ballet step");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your string here: ");
        String str = br.readLine();
        String s = br.readLine();

        comparison(str, s);


     //   String str = sb.toString();
        System.out.println("string value is: " + str);



        System.out.println("without using stringbuilder class: " + isPalindrome(str));
        System.out.println("using Stringbuilder class: " + usingStringBuilder(str));

    }

    public static boolean comparison(String str, String s) {

        if(str.equals(null) || s.equals(null))
            return false;

        if(str.compareTo(s) > 0) {
            return  true;
        }
        else
            return false;

    }

    public static boolean usingStringBuilder(String str) {

        if (str.equals(null))
            return false;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }

    public static boolean isPalindrome(String s) {

        if (s.equals(null))
            return false;

        int length = s.length();

        for(int i = 0; i < length/2; i++) {

            if(s.charAt(i) != s.charAt(length - i - 1)) {

                return  false;
            }
        }

        return true;
    }
}
