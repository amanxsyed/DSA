import java.util.*;

/* Question
 * you have been given an integer array of size N. Where N is equal to [2M+1]. In given array list, M Number  is presented twice & one number is presented only once. You need to find and return that number which  is unique in array. solve this question in Java
 */

public class Find_Unique {
    public static int FindUni(int[] arr){
        int result = 0;
        for(int num : arr){
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,1,2,5};
        System.out.println(FindUni(arr));
        
    }
}