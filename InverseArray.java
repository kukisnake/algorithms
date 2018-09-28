import java.util.ArrayList;
import java.util.List;

public class InverseArray {
    private static List inverseArray(int[] arr) {

        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            listOfNumbers.add(arr[i]);
        }

        List<Integer> newCreatedList = new ArrayList<>();


        for (int i = 0; i < listOfNumbers.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                newCreatedList.add(listOfNumbers.get(listOfNumbers.size() - 1));
                listOfNumbers.remove(listOfNumbers.size() - 1);
            }
        }
        System.out.println(newCreatedList);
        return newCreatedList;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,2832,3240342};
        inverseArray(arr);
    }
}
