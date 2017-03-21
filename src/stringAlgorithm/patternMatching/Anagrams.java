package stringAlgorithm.patternMatching;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

/**
 * Created by vikas on 10/19/16.
 */
public class Anagrams {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the first string: ");
        String A = null;
        try {
            A = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("enter the second string: ");
        String B = null;
        try {
            B = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(anagram(A,B) == false) {
            System.out.println("this is not an anagram");
        }
        else
            System.out.println("this is an anagram!!!!!!!!!!");

    }

    public static boolean anagram(String a, String b) {

        if( a == null)
            System.out.println("'A' has null value please provide a value");
        if(b == null)
            System.out.println("'B' has null value please provide a value for B");
        if(a == "")
            System.out.println("A doesn't contain any value");
        if(b == "")
            System.out.println("B doesn't contain any value");

        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length())
            return false;

        else {
            Map<Character, Integer> map = new HashMap<>();
            int length = a.length();

            for(int i = 0; i < length; i++) {

                char aChar = a.charAt(i);
                if(map.containsKey(aChar)) {
                    map.put(aChar, map.get(aChar) + 1);
                }
                else {
                    map.put(aChar, 1);
                }
                char bChar = b.charAt(i);
                if(map.containsKey(bChar)) {
                    map.put(bChar, map.get(bChar) -1);
                }
                else {
                    map.put(bChar, -1);
                }
            }
            for(int value : map.values()) {
                if(value != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
