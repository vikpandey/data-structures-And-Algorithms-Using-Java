package stringAlgorithm.patternMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();

        if(s == null) {
            System.out.println("String value is null: " + s);
        }
        if(firstUniqueChar(s) == -1) {
            System.out.println("No Unique character in the string");
        }
        else {
            System.out.println("Index of the unique character is: " + firstUniqueChar(s));
        }


    }

    public static int firstUniqueChar(String str) {

        HashMap<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if(count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            }
            else {
                count.put(c, 1);
            }
        }

        for(int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if(count.get(c) == 1){
                return 1;
            }
        }

        return -1;
    }

}
