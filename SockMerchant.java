import org.apache.commons.lang3.ArrayUtils;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Integer[] allColours = Arrays.stream( ar ).boxed().toArray( Integer[]::new );
        int numberOfPairs = 0;
        Set<Integer> noDuplicates = new HashSet<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer colour : allColours) {
            noDuplicates.add(colour);
            if (noDuplicates.contains(colour)) {
                if (map.containsKey(colour)) {
                    map.put(colour, map.get(colour) +1);
                } else {
                    map.put(colour, 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int dividable = entry.getValue() / 2;
            if (dividable > 0) {
                numberOfPairs = numberOfPairs + dividable;
            }
        }
        return numberOfPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int socks = 9;
        int[] colours = {10,20,20,10,10,30,50,10,20};
        sockMerchant(socks,colours);

    }
}
