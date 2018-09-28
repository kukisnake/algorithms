public class EvenOrNot {

    public static int solution(int[] A) {
        int output = 0;

        for (int i = 0; i <A.length; i++) {
            int number1 = A[i];
            for (int j = i+1; j < A.length; j++) {
                int number2 = A[j];
                if (even(number1+number2)) {
                    output++;
                }
            }
        }
        if (output > 1000000000) {
            output = -1;
        }

        System.out.println(output);
        return output;
    }

    private static boolean even (int num) {
        return num % 2 == 0;
    }

    public static void main(String[]args) {
        int [] arr = {2,1,5,-6,9};
        solution(arr);
    }
}