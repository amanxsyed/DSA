import java.util.Scanner;

public class NamesArray{
    public static void main(String[] args) {
        
        //Using Scanner Class for Input Values From User
        Scanner sc = new Scanner(System.in);
        int size = 100;

        //Declaring an Array
        String[] names = new String[size]; 

        System.out.println("How Many Names You Want to Enter: ");
        int numberOfNames= sc.nextInt();

        System.out.println("Enter Names: ");

        //input
        for(int i=0; i<numberOfNames; i++){
            names[i] = sc.next();
        }

        //output
        for(int i=0; i<numberOfNames; i++){
            System.out.println("Name on position 2"+ (i+1) +" is : " + names[i]);
        }

        System.out.println("Your Names Printed Successfully");
        System.out.println("Thanks for using our program!");
        System.out.println("Happy Coding");

    }
}