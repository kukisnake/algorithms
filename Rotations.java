import org.apache.commons.lang3.ArrayUtils;

import java.io.*;
import java.util.*;

public class Rotations {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        List<Integer> listOfNumbers = new ArrayList<>();

        for (int el : a) {
            listOfNumbers.add(el);
        }

        List<Integer> newCreatedList = new ArrayList<>();

        int numberOfLeftMoves = d;

        System.out.println("Ilość przesunięć: " + d);

        if (d < a.length) {
            System.out.println("Przesuwamy o mniejszą ilośc niż wielkość tablicy");
            Integer lastElement = listOfNumbers.get(listOfNumbers.size()-1);
            System.out.println("Ostatni element: " + lastElement);

            for (int i = 1; i <= numberOfLeftMoves; i++) {
                newCreatedList.add(listOfNumbers.get(listOfNumbers.size() -i));
                break;
            }

        } else {
            System.out.println("Ilość miejsc w lewo dłuższa niż sama lista");
        }

        System.out.println("Lista numerów: " + listOfNumbers);
        System.out.println("Ostateczna lista:" + newCreatedList);

/*        String result = IntStream.of(a)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));

        System.out.println(Arrays.toString(a));
        System.out.println(result);*/

        return a;
    }

    public static int[] rotRight(int[] a, int d) {
        if(d > a.length)
            d=d%a.length;

        int[] result = new int[a.length];

        for(int i=0; i < d; i++) {
            result[i] = a[a.length-d+i];
        }

        int j=0;
        for(int i=d; i<a.length; i++){
            result[i] = a[j];
            j++;
        }

        //System.arraycopy( result, 0, a, 0, a.length );
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(result));
        return a;
    }

    public static void rotate(int[] arr, int order) {
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if(order < arr.length){
            order = order %arr.length;
        }

        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1)
            return;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] newTry(int[] a, int d) {

        List<Integer> rotatedArr = new ArrayList<>();

        if (a.length > d) {
            for (int i = d; i < a.length; i++) {
                rotatedArr.add(a[i]);
            }

            int remainingRotationsNeeded = a.length - rotatedArr.size();

            for (int i = 0; i < remainingRotationsNeeded; i++) {
                rotatedArr.add(a[i]);
            }

        }

        int [] primitiveArr = new int[rotatedArr.size()];
        int i = 0;
        for (Integer number : rotatedArr) {
            primitiveArr[i] = number;
            i++;
        }

        System.out.println(Arrays.toString(primitiveArr));
        System.out.println(rotatedArr);
        return primitiveArr;
    }


    public static void main(String[] args) {

        int d = 10;

        int[] a = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};


        newTry(a, d);

    }
}
