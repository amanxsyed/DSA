import java.util.*;
// Find the maximum & minimum number in an array of integers. 
public class Max_Min_Num_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Number You Wanted to Add in Test ? ");
        int size = sc.nextInt();

        //Declare an Array
        int[] numbers = new int[size];

        //input Loop
        for(int i=0; i<size; i++){
            System.out.println("Enter Number "+(i+1)+" : ");
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //Finding Min Value in Array
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] < min ){
                min = numbers[i];
                
            }
        }

        //Finding Max Value in Array
        for(int i =0;i<numbers.length;i++){
            if(numbers[i] > max){
                max = numbers[i];
                
            }
        }
        System.out.println("Smallest Number is: "+ min);
        System.out.println("Largest Numbers is: "+max);
    }
}