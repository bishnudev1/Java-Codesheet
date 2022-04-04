class A{
    void Shape(){
        System.out.println("Can't Detect Shape...");
    }
}

class B extends A{
    @Override
    void Shape(){
        super.Shape();
        System.out.println("It's a Squre Shape !");
    }
}

class Demo{
    public static void main(String[] args) {
        A obj = new B();
        obj.Shape();
    }
}