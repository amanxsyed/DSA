import java.util.*;

public class SwapAlternate {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Number You Wanted to add in test ? ");
        int size=sc.nextInt();

        int[] Array = new int[size];
        //int[] odd = { 1, 3, 8, 7, 6, 5 };

        //input Numbers
        for(int i=0; i<size; i++){
            System.out.println("Enter Number "+(i+1)+" : ");
            Array[i] = sc.nextInt();
        }

        System.out.println("Even Array before swapping:");
        printArray(Array);
        swapAlternate(Array);
        System.out.println("Even Array after swapping:");
        printArray(Array);

    }
}
