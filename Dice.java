// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class Dice {
    public static int solution(int[] A) {

        int moves = 0;
        int bestScore = Integer.MAX_VALUE;

        for (int i=1; i < 7; i++) {
            System.out.println("Checking how many moves needed to have " + i);
            for (int j=0; j < A.length; j++) {
                switch (i) {
                    case 1:
                        if (A[j] == 1) {
                            continue;
                        } else if (A[j] == 6) {
                            moves = moves + 2;
                        } else {
                            moves++;
                        }
                        break;
                    case 2:
                        if (A[j] == 2) {
                            continue;
                        } else if (A[j] == 5) {
                            moves = moves + 2;
                        } else {
                            moves++;
                        }
                        break;
                    case 3:
                        if (A[j] == 3) {
                            continue;
                        } else if (A[j] == 4) {
                            moves = moves + 2;
                        } else {
                            moves++;
                        }
                        break;
                    case 4:
                        if (A[j] == 4) {
                            continue;
                        } else if (A[j] == 3) {
                            moves = moves + 2;
                        } else {
                            moves++;
                        }
                        break;
                    case 5:
                        if (A[j] == 5) {
                            continue;
                        } else if (A[j] == 2) {
                            moves = moves + 2;
                        } else {
                            moves++;
                        }
                        break;
                    case 6:
                        if (A[j] == 6) {
                            continue;
                        } else if (A[j] == 1) {
                            moves = moves + 2;
                        } else {
                            moves++;
                        }
                        break;
                }
            }
            System.out.println("There are " + moves + " moves needed to make " + i);
            if (moves < bestScore) {
                bestScore = moves;
            }
            moves = 0;
        }

        System.out.println(bestScore);
        return bestScore;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,6,1};
        solution(arr);
    }
}