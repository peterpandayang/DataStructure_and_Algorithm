package QuickSort;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/1/24.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] x = { 9, 2, 4, 7, 3, 7, 10 };
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quick(x);
        System.out.println(Arrays.toString(x));
    }

    public static void quick(int[] number) {
        sort(number, 0, number.length-1);
    }

    private static void sort(int[] number, int left, int right) {
        if(left < right) {
            int q = partition(number, left, right);
            sort(number, left, q-1);
            sort(number, q+1, right);
        }

    }

    private static int partition(int number[], int left, int right) {
        int i = left - 1;
        for(int j = left; j < right; j++) {
            if(number[j] <= number[right]) {
                i++;
                swap(number, i, j);
            }
        }
        swap(number, i+1, right);
        return i+1;
    }

    private static void swap(int[] number, int i, int j) {
        int t = number[i];
        number[i] = number[j];
        number[j] = t;
    }

}