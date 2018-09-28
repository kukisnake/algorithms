import junit.framework.TestCase;

public class NumberOfBits {

    public static int solution(int[] A) {
        int number = 0;
        for (int i = 0; i <A.length; i++) {
            number += A[i] * Math.pow(8,i);
        }
        String binaryNumber = Integer.toBinaryString(number);
        int counter = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == 1)
                counter++;
        }

        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6};
        solution(arr);
    }
}
