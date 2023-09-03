import java.util.*;
// Find the maximum & minimum number in an array of integers. 
 
public class Max_Min_Num_Array{

    //Declaring a Method for Max Value
    public int getMax(int numbers[], int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }

    //Declaring a Method for Min Value
    public int getMin(int numbers[], int n){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Number You Wanted to Add in Test ? ");
        int size = sc.nextInt();

        //Declare an Array
        int[] numbers = new int[100];

        //input Loop
        for(int i=0; i<size; i++){
            System.out.println("Enter Number "+(i+1)+" : ");
            numbers[i] = sc.nextInt();
        }

        Max_Min_Num_Array obj = new Max_Min_Num_Array();
        int min = obj.getMin(numbers, size);
        int max = obj.getMax(numbers, size);

        System.out.println("Smallest Number is: "+ min);
        System.out.println("Largest Numbers is: "+ max);
    }
}