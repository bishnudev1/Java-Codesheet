import java.util.Scanner;

class WhileLoop{
    public static void main(String[] args) {
        int key;
        System.out.println("Enter the number : ");
        Scanner obj = new Scanner(System.in);
        key = obj.nextInt();
        while (key >=0) {
            if(key % 2 == 0){
                System.out.println("Even Number");
                break;
            }
            else{
                System.out.println("Odd Number");
                break;
            }
        }
    }
}