import java.util.Arrays;
import java.util.Random;

public class SumPositives {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE  = "\u001B[34m";

    public static void main(String[] args) {
        int[] foo = randArray(10, -200, 200);

        System.out.println(Arrays.toString(foo));
        System.out.println(ANSI_BLUE + "Sum of positive elements: " + ANSI_RESET);
        System.out.println(sumPositives(foo));
    }

    public static int sumPositives(int[] arr) {
        int result = 0;
        for (int el : arr) {
            result += (el > 0) ? el : 0;
        }

        return result;
    }

    public static int[] randArray(int arrLength, int min, int max) {
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = new Random().nextInt(max - min) + min;
        }

        return array;
    }
}
