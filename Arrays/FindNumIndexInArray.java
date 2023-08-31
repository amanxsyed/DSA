import java.util.Scanner;

/* Question
 * Take an Array as input from the user. 
 * Search for a given number x && print the index at which   it occurs
 */
public class FindNumIndexInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Using Scanner class for user input
        System.out.println("Size of an Array?");
        int size = sc.nextInt(); 
        int numbers[] = new int[size]; // Declaring an array

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number to find: ");

        int num = sc.nextInt(); //input for number user wanted to find?

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==num){
                System.out.println("Number found at index: "+ i);
                break;
            }else{
                System.out.println("Number not found");
                break;
            }
        }

    }   
}