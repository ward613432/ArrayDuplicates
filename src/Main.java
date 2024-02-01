import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] repeats = new int[10];
        Random random = new Random();

        // Init array & map
        for (int i = 0; i < 10; i++) {
            repeats[i] = random.nextInt((10 - 1) + 1) + 1;
        }
        Map<Integer, Integer> repeatsMap = new HashMap<>();

        // Output everything
        System.out.println(Arrays.toString(repeats));

        for (int i = 0; i < repeats.length; i++) {
            int currentNumber = repeats[i];

            if (!repeatsMap.containsKey(currentNumber)) {
                int count = timesRepeated(repeats, currentNumber);
                if (count > 1) {
                    repeatsMap.put(currentNumber, count);
                    System.out.printf("The number %d occurs %d times\n", currentNumber, count);
                }
            }
        }
    }

    private static int timesRepeated(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        return count;
    }
}