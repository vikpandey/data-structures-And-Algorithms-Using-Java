package stringAlgorithm.patternMatching;

/**
 * Created by vikas on 10/17/16.
 */


import java.io.*;
import java.util.*;


public class LexicographicallyHighToLow {


    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int number = sc.nextInt();

        lexHighLow(str, number);
    }

    public static void lexHighLow(String s, int n) {

        String[] sArr = new String[3];
        int len = s.length()%n;
        String sHigh = null;
        String sLow = null;

        for(int i = 0; i < len; i++) {
            sArr[i] = s.substring(i, i+3);
        }

        for(int i = 0; i < len; i++) {
            if(sArr[i].compareTo(sArr[i+1]) > 0) {
                sHigh = sArr[i];
                sLow = sArr[i+1];
            }
        }
        System.out.println(sLow);
        System.out.println(sHigh);
    }

}






