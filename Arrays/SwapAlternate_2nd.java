import java.util.*;

public class SwapAlternate_2nd {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapAlternate(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] even = { 5, 7, 8, 9, 2 };
        int[] odd = { 1, 3, 8, 7, 6, 5 };

        System.out.println("Even Array before swapping:");
        printArray(even);
        swapAlternate(even);
        System.out.println("Even Array after swapping:");
        printArray(even);

        System.out.println("Odd Array before swapping:");
        printArray(odd);
        swapAlternate(odd);
        System.out.println("Odd Array after swapping:");
        printArray(odd);
    }
}
