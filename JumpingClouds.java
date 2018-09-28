import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int numberOfClouds = c.length;
        List<Integer> cloudList = new ArrayList<>();

        for (int cloud : c ) {
            cloudList.add(cloud);
        }

        int minimumStepsNeeded = 0;
        int currentIndex = 0;
        //for (currentIndex = 0; currentIndex < numberOfClouds; currentIndex++) {
        for (Integer cloud : cloudList) {
            if (numberOfClouds - 1 == currentIndex) {
                break;
            } else if (numberOfClouds -2 == currentIndex && cloudList.get(numberOfClouds -1) == 0) {
                minimumStepsNeeded++;
                currentIndex++;
                break;
            }
                System.out.println("Current index is: " + (currentIndex));
                if (cloudList.get(currentIndex + 1) == 1 ) {
                    minimumStepsNeeded++;
                    currentIndex = currentIndex + 2;
                } else if (cloudList.get(currentIndex + 1) == 0) {
                    if (cloudList.get(currentIndex +2) == 0) {
                        minimumStepsNeeded++;
                        currentIndex = currentIndex + 2;
                    } else {
                        minimumStepsNeeded++;
                        currentIndex = currentIndex + 1;
                    }
                }
            }
        System.out.println(minimumStepsNeeded);
        return minimumStepsNeeded;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] binaryArray = {0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0};
        jumpingOnClouds(binaryArray);
    }
}
