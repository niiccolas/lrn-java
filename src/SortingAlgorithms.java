import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingAlgorithms {
   public static final String ANSI_RED   = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_RESET = "\u001B[0m";

   public static void main(String[] args) {
       int[] wuTang       = {4, 9, 3, 5};
       int[] wuTangSorted = quickSort(wuTang);

       System.out.println(ANSI_RED + "Before Quick Sort:" + ANSI_RESET);
       System.out.println(Arrays.toString(wuTang));
       System.out.println(ANSI_GREEN + "After Quick Sort:" + ANSI_RESET);
       System.out.println(Arrays.toString(wuTangSorted));
   }

   public static int[] quickSort(int[] arr) {
       if (arr.length <= 1) {
           return arr;
       }

       int pivot = arr[arr.length - 1];
       ArrayList<Integer> leftOfPivot  = new ArrayList<Integer>();
       ArrayList<Integer> rightOfPivot = new ArrayList<Integer>();

       for (int el : arr) {
           if (el == pivot) {
               // do nothing
           } else if (el < pivot) {
               leftOfPivot.add(el);
           } else if (el > pivot) {
               rightOfPivot.add(el);
           }
       }



       int[] sortedLeft = quickSort(leftOfPivot.toArray());
       leftOfPivot.addAll(rightOfPivot);
       leftOfPivot.add(pivot);
       System.out.println(leftOfPivot.toString());
       return arr;
   }

   public static int[] randArray(int arrLength, int min, int max) {
       int[] array = new int[arrLength];
       for (int i = 0; i < arrLength; i++) {
           array[i] = new Random().nextInt(max - min) + min;
       }

       return array;
   }

  // Function to merge two arrays in Java 8
  public static int[] concatenate(int[] first, int[] second)
  {
      return IntStream.concat(Arrays.stream(first), Arrays.stream(second))
              .toArray(int[]::new);
  }

}
