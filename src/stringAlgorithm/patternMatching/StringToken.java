package stringAlgorithm.patternMatching;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vikas on 10/23/16.
 */
public class StringToken {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");

            String s = br.readLine();

        System.out.println("string after trimming it: " + s.trim());
        String delim = "[ !@.?,'_]+";
        String[] words = s.trim().split(delim);
        System.out.println("no. of tokens are: " + words.length);
        for(String word : words) {
            System.out.println(word);
        }
    }
}
