class A{
    int a;
    String b;
    A(){
        a=20; b="Bishnudev Khutia";
        System.out.println(a + " " + b);
    }
    A(A ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
}

class B{
    public static void main() {
        A r = new A();
        A r2 = new A(r);
    }
}
