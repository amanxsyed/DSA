import java.util.*;
public class arrays {
    public static void main (String[] args){
        int[] marks = new int[3];
        marks[0]=97; //phy
        marks[1]=98; //chem
        marks[2]=95; //eng
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);   
        }

        int[] sem ={1,2,3,4,5,6,7,8};
        for(int i=0; i<sem.length; i++){
            System.out.println(sem[i]);
        }
    }
}