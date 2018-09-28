// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Shoes {
    public static int solution(String S) {

        int rightShoes = 0;
        int leftShoes = 0;
        int workersNeeded = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'L') {
                leftShoes++;
            }
            if (S.charAt(i) == 'R') {
                rightShoes++;
            }
            if (leftShoes == rightShoes) {
                workersNeeded++;
                leftShoes=0;
                rightShoes=0;
            }
        }
        System.out.println(workersNeeded);
        return workersNeeded;
    }

    public static void main(String[] args) {
        solution("RLRLLLRLRLRL");
    }
}

