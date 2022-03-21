import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int key;
        int a = 20;
        int b = 10;
        System.out.println("1 : Addition || 2 : Subtraction || 3 : Multiplication || 4 : Division ");
        System.out.println(" Enter the operation : ");
        Scanner obj = new Scanner(System.in);
        key = obj.nextInt();
        switch (key) {
            case 1:
                System.out.println("The Addition is : " + (a + b));
                break;

            case 2:
                System.out.println("The Subtraction is : " + (a - b));
                break;

            case 3:
                System.out.println("The Multiplication is : " + (a * b));
                break;

            case 4:
                System.out.println("The Division is : " + (a / b));
                break;

            default:
                System.out.println("Wrong key entered");
                break;
        }
    }
}

// + - * / -> Arithmetic Operators
