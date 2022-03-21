import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int pass;
        System.out.print("Enter Password : \n");  // "\n" give a line break between two lines
        // Scanner obj = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        pass = obj.nextInt();
        if (pass == 2730) {
            System.out.println("Welcome Sir !");
        }
        else{
            System.out.println("Wrong Password !");
        }
    }
}
