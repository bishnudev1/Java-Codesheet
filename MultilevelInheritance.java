
class A {
    int a;
    int b;
    int c;

    void Add() {
        a = 10;
        b = 20;
        c = 30;
        System.out.println("The Addition Value is : " + (a + b + c));
    }
}

class B extends A {

    void Mul() {
        a = 5;
        b = 10;
        c = 15;
        System.out.println("The Multiply Value is : " + (a * b * c));
    }
}

class C extends B {
    void Rem() {
        a = 5;
        b = 10;
        c = (a % b);
        System.out.println("The Reminder Value is : " + c);
    }
}

class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.Add();
        obj.Mul();
        obj.Rem();
    }
}