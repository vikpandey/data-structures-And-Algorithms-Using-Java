package stringAlgorithm.patternMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vikas on 10/16/16.
 */
public class ToUpperToLower {

    public static void main(String[] args) {

        String s = null;
        System.out.println("enter a String: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        toUpper(s);
    }

    public static void toUpper(String s) {

        if(s == null)
            System.out.println("null value in String 's'!!!");

        System.out.println("result is: "+ s.toUpperCase());

        System.out.println("charater at a given position: " + s.toUpperCase().charAt(0) + s.substring(1));


    }
}
