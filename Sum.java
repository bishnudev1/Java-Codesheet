import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        int a,b,c;
        System.out.print("Enter two numbers : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.print("The sum of two number is : " + c);
    }
}
