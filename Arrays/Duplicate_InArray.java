public class Duplicate_InArray{
    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        int result = 0;

        // XOR all elements from 1 to N-1
        for (int i = 1; i < n; i++) {
            result ^= i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 4, 4, 5};
        System.out.println("The duplicate number is: " + findDuplicate(arr));
    }
}