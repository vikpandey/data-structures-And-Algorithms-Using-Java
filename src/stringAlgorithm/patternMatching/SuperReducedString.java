package stringAlgorithm.patternMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vikas on 11/7/16.
 */
public class SuperReducedString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringBuilder sb = new StringBuilder(s);

        Character.isUpperCase(sb.charAt(0));

        for (int i = 0; i < sb.length() - 1; i++) {

                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    i--;
                    if(i!=-1)
                        i--;
                }
            }

            if(sb.length() == 0){
                System.out.println("EMPTY STRING");
            }
            else{
                System.out.println(sb.toString());
            }
    }




}
