import java.util.ArrayList;
import java.util.List;

public class Temperature {

    public static int temperature(int[] T) {


        int temperatureOfWinter = 0;

        int temperatureOfSummer = 0;

        int indexBetweenWinterAndSummer = 0;

        for (int i = 0; i < T.length; i++) {
            if (T[i] < temperatureOfWinter || T[i] == T[0]) {
                temperatureOfWinter = temperatureOfWinter + T[i];
            } else if (T[i] > temperatureOfWinter) {
                indexBetweenWinterAndSummer = T[i];
                for (int j = indexBetweenWinterAndSummer; j < T.length-j; j++) {
                    temperatureOfSummer = temperatureOfSummer + T[j];
                }
            }
        }
        System.out.println(indexBetweenWinterAndSummer);
        System.out.println(temperatureOfSummer);
        System.out.println(temperatureOfWinter);
        return temperatureOfWinter;
    }

    public static void main(String[] args) {
        int[] T = {5, -2, 3, 8, 6};
        temperature (T);
    }
}
