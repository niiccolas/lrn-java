import java.util.Arrays;

public class MyReverse {
    public static void main(String[] args) {
        int[] wu = {22, 31, 5, 9, 12};
        System.out.println(Arrays.toString(reverse(wu)));
    }

    public static int[] reverse(int[] arr) {
        int[] result = new int [arr.length];
        int nIndices = arr.length - 1;
        
        for (int i = nIndices; i >= 0 ; i--) {
            result[nIndices - i] = arr[i];
        }
        
        return result;
    }
}
