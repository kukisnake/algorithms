import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArray {

    static int ROWS = 6;
    static int COLUMNS = 6;

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        if (ROWS < 3 || COLUMNS < 3) {
            return -1;
        }
        int maxSum = Integer.MIN_VALUE;
        int totalNumberOfHourglasses = (ROWS-2)*(COLUMNS-2);

        for (int i = 0; i < ROWS -2; i++) {
            for (int j = 0; j < COLUMNS -2; j++) {
                int sum = (arr[i][j] + arr[i][j +1] + arr[i][j+2])
                        + (arr[i+1][j+1])
                        + (arr[i+2][j] + arr[i+2][j+1] +arr[i+2][j+2]);
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Total number of hourglasses: " + totalNumberOfHourglasses);
        System.out.println("Max sum is: " + maxSum);

        return maxSum;
    }

    public static int[] histogram(int[][] a, int high) {
        // Please write your code after this line
        // init new array
        int numOfRows = a.length;
        int numOfCols = a[0].length;
        int[] retVal = {};
        //main loop
        for (int o = 0; o < high; o++){
            //System.out.println(o);
            // go trough rows
            for(int row = 0; row < numOfRows; row++ ){
                // check for colum values
                int count = 0;
                for(int col = 0; col < numOfCols; col++ ){

                    if(a[row][col] == o ){
                        count++;
                    }
                }
                retVal[o] = count; // Fixed typo
            }
        }
        return retVal;
    }

    public void createSixXSixArray() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s=s.replaceAll("\\s+", "");
        char []ch = s.toCharArray();
        char [][]charArray = new char[6][6];
        int i=0, j=0;

        for(int k=0;k<ch.length;k++)
        {
            if(i<=5 && j<=5)charArray[i][j] = ch[k];
            j++;
            if(j>5) {
                j=0;
                i++;
            }
            if(i>5 && j>5) break;
        }
        System.out.println(charArray.toString());
    }

    public static void main(String[] args) {

        /*for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }*/

        //hourglassSum(arr);

        int [][] arr =
                {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        int res = hourglassSum(arr);
        if (res == -1)
            System.out.println("Not possible");
        else
            System.out.println("Maximum sum of hour glass = "
                    + res);
    }
}

