import java.util.Scanner;

public class NamesArray{
    public static void main(String[] args) {
        
        //Using Scanner Class for Input Values From User
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names you wanted to enter: ");
        int size = sc.nextInt();

        //Declaring an Array
        String[] names = new String[size]; 

        System.out.println("Enter the Names You Want to Enter: ");

        //input
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }

        //output
        for(int i=0; i<names.length; i++){
            System.out.println("name "+ (i+1) +" is : " + names[i]);
        }


    }
}