// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;

class Solution {
    public static int solution(int[] A) {
        // write your code in Java SE
        Arrays.sort(A);
        int smallestInt = A[0];

        for (int i = 0;i < A.length; i++) {
            if (A[i] > 0 && smallestInt == A[i]) {
                smallestInt = A[i] +1;
            } else {
                smallestInt =1;
            }
        }

        System.out.println(smallestInt);
        return smallestInt;
    }

    public static void main(String[] args) {
        int [] A = {1,2,3};
        solution(A);
    }
}