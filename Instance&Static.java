class A {
    int a = 20;
    int b = 30;
    static int c = 40;
    static int d = 60;
    {
        System.out.println("This is Instance in Java");
        System.out.println(a+b);
    }

    // It does not require any object to initialize
    // In Static Method the global variables should be static to or you can't use it
    static {
        System.out.println("This is Static Block in Javan\n");
        System.out.println(c+d);
    }

    public static void main(String[] args) {
        A obj = new A();
    }
}
