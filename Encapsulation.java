class A{
    private int a = 20;
    private int b = 10;

    public void Addition(){
        System.out.println("The Addition is : " + (a+b));
    }

    public void Subtraction(){
        System.out.println("The Subtraction is : " + (a-b));
    }

    public void Multiplication(){
        System.out.println("The Multiplication is : " + (a*b));
    }

    public void Division(){
        System.out.println("The Division is : " + (a/b));
    }
}

class Encapsulation{
    public static void main(String[] args) {
        A obj = new A();
        obj.Addition();
        obj.Subtraction();
        obj.Multiplication();
        obj.Division();
        
        //It has no accessable as a & b are private variables so you can't access directly through objects 
        System.out.println(obj.a);
    }
}