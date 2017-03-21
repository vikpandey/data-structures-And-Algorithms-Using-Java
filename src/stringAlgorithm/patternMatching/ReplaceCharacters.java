package stringAlgorithm.patternMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by vikas on 10/16/16.
 */
public class ReplaceCharacters {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = null;
        try {
             s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char a = sc.next().charAt(0);

        System.out.println("so the value is: ");
        System.out.println(replaceAll(s, a));

    }

    public static String replaceAll(String str, char a) {

        if(str == null)
            return null;

       return str.replaceAll(Character.toString(a), "");

    }
}
