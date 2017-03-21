package stringAlgorithm.patternMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vikas on 10/23/16.
 */
public class SplitString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the string");
        String s = br.readLine();

        s = s.trim();
        String[] arr = s.split("[, ]+");
        System.out.println("no. of tokens are: " + arr.length);
        for(String word : arr) {
            System.out.println(word);
        }

    }
}
