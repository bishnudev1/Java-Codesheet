
//Method are two types - i> Pre-defined like print(), nextInt(), sleep() ii> User-defined like sum(), addition()


public class Method {
    public static void main(String[] args){
        System.out.print("Method in Java ");
        System.out.print(Sum(10,36));    // Method Calling
        Greet();

    }
    static int Sum(int A, int B){   //Method Definition
        return A+B;
    }

    static void Greet(){
        System.out.print("Happy Coding !");
    }
}
