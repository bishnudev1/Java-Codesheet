class A{
    void Input(){
        System.out.println("Loading Names...");
    }
}

class B extends A{
    void Bishnudev(){
        System.out.println("Hello Bishnudev !");
    }
}

class C extends A{
    void Austin(){
        System.out.println("Hello Austin !");
    }
}

class Test{
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.Input();
        b.Bishnudev();
        c.Input();
        c.Austin();
        }
}