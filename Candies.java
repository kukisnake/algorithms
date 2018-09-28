import java.util.ArrayList;
import java.util.List;

public class Candies {

    public static int candies(int[] T) {

        int numberOfCandies = T.length;

        List<Integer> candiesToEat = new ArrayList<>();

        if (numberOfCandies % 2 == 0){
            for (int i = 0; i < numberOfCandies; i++) {
                if (!candiesToEat.contains(T[i])) {
                    candiesToEat.add(T[i]);
                }
            }
        }
        if (numberOfCandies/2 < candiesToEat.size()) {
            int numberNeededTo = candiesToEat.size()%(numberOfCandies/2);
            System.out.println(candiesToEat.size() - numberNeededTo);
            return candiesToEat.size() - numberNeededTo;
        } else {
            System.out.println(candiesToEat.size());
            return candiesToEat.size();
        }
    }

    public static void main(String[] args) {
        int[] T = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
        candies(T);
    }
}
