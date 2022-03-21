import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //Defined

        // int A[] = {2,4,6,8,10};

        //User Input

        int A[] = new int[5];
        System.out.print("Enter the Elements : ");
        Scanner obj = new Scanner(System.in);

        for(int i=0;i<5;i++){
            A[i] = obj.nextInt();
        }

        Arrays.sort(A);  //For sort the Array

        System.out.print("Array Elements are : \n");
        for(int B:A){
            System.out.println(B + " ");
        }
    }
}
