class A{
    int a;
    String b;
    double c;
    private A(){
        a = 20;
        b = "Bishnudev Khutia";
        c = 9.75;
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        A r = new A();
    }
}

// We can use Private Constructor values in the same class but if we initialize it in another class it will give us error

class B{
    public static void main(String[] args) {
        A r2 = new A();
    }
}