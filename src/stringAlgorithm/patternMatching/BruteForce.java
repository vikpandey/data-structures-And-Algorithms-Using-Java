package stringAlgorithm.patternMatching;

import java.util.Scanner;

/**
 * Created by vikas on 10/11/16.
 */
public class BruteForce {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("enter the text: ");
        String text = console.next();
        System.out.println("enter the pattern: ");
        String pattern = console.next();
        char[] tarr = text.toCharArray();
        char[] parr = pattern.toCharArray();
        for(int i = 0; i< tarr.length; i++) {

            System.out.println("text array: "+tarr[i]);
        }

        for(int i = 0; i < parr.length; i++) {

            System.out.println("pattern array: " + parr[i]);

        }



       // stringMatching(text, pattern);
    }

    /*
    public static boolean stringMatching(String t, String p) {

        char[] textArr = t.toCharArray();
        char[] patternArr = p.toCharArray();

        for(int i = 0; i < textArr.length; i++) {

            if (textArr[i] == patternArr[i]) {
                if(textArr[i+1] == patternArr[i+1])
            }
        }

    }
    */
}

