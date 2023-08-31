import java.util.Scanner;

public class NumberInputArray{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Scanner class for user input
        System.out.println("Size of an Array?");
        int size = sc.nextInt();
        int numbers[] = new int[size]; // Declaring an array

        //input values of array
        for(int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        };
        
        System.out.println("Array of Numbers");

        //output
        for(int i=0; i<size;i++){
            System.out.print(numbers[i] + " ");
        };
        
    }
}