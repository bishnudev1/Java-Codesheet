import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args){
        int math,science,eng,avg;
        System.out.print("Enter Math, Science & English marks respectively : ");
        Scanner obj = new Scanner(System.in);
        math = obj.nextInt();
        science = obj.nextInt();
        eng = obj.nextInt();
        avg = (math+science+eng)/3;
        if(math > 25 && science > 25 && eng > 25 && avg > 30){
            System.out.println("You have passed the exam and you got average of " + avg + " marks");
        }
        else if(math > 25 && science > 25 && eng > 25 && avg < 30){
            System.out.println("You have passed in all subjects but you got low average of " + avg + " marks and Guardian Call");
        }
        else if(math < 25 || science < 25 || eng < 25 && avg > 30){
            System.out.println("You have failed in one subject but you got passed in average of " + avg + " marks.Try better in next exam");
        }
    }
}
