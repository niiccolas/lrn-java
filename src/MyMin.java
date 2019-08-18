public class MyMin {
    public static void main(String[] args) {
        int[] akbar = {32, -400, 3, 199, 4, 28};
        System.out.println(min(akbar));
    }
    
    public static int min(int[] arr) {
        int minValue = 0;

        for (int el : arr) {
            if (el < minValue) {
                minValue = el;
            }
        }

        return minValue;
    }
}

