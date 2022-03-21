import java.util.Scanner;

public class ArrayTwoD {
    public static void main(String[] args) {
        int A[][] = new int[2][2];
        System.out.print("Enter the Elements : ");
        Scanner obj = new Scanner(System.in);

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            A[i][j] = obj.nextInt();
            }
        }

        System.out.print("Array Elements are : \n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
