import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import static java.lang.Math.toIntExact;

public class RepeatedString {

    // Complete the repeatedString function below.
/*    static long repeatedString(String s, long n) {
        String concatenatedWord = "";
        long stringLength = s.length();
        int modulo = toIntExact(n%stringLength);
        if (stringLength < 2 && s.equals("a")) {
            return n;
        } else if (!s.contains("a")) {
            return 0;
        } else {
            long i;
            for (i = 0; i < n / stringLength; i++) {
                concatenatedWord = concatenatedWord + s;
            }

            if (modulo > 0) {
                String restOfTheWord = s.substring(0, modulo);
                concatenatedWord += restOfTheWord;
            }
            long count = concatenatedWord.length() - concatenatedWord.replace("a", "").length();
            System.out.println(count);

            return count;
        }
    }*/

    static long repeatedString(String s, long n) {
        long stringLength = s.length();
        int modulo = toIntExact(n%stringLength);
        long ourLetters = s.length() - s.replace("a", "").length();
        String remainingWord = s.substring(0,modulo);
        long additionalLetters = remainingWord.length() - remainingWord.replace("a", "").length();
        long result = n/stringLength * ourLetters + additionalLetters;

        System.out.println(additionalLetters);
        System.out.println(result);
        System.out.println(modulo);
        System.out.println(ourLetters);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = "cfimaakj";
        long n = 554045874191L;

        repeatedString(s, n);
    }
}
