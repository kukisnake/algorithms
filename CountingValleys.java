import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        String[] allSteps = s.split("");
        int attitude = 0;
        int numberOfValleys = 0;
        String lastStep = "";
        for (String oneStep : allSteps) {
            if (oneStep.equals("U")) {
                attitude = attitude +1;
                lastStep = "U";
                if (attitude == 0) {
                    numberOfValleys++;
                }
            } else if (oneStep.equals("D")) {
                attitude = attitude -1;
                if (attitude == 0 && lastStep.equals("U")) {
                    lastStep = "D";
                }
            }

        }
        System.out.println(numberOfValleys);

        return numberOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        countingValleys(8,"UDDDUDUU");
    }
}
