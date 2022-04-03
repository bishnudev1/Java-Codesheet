class A{
    A(){
        System.out.println("Learn Coding !");
    }
    A(int a){
        this();
        System.out.println(a);
    }
    public static void main(String[] args) {
        A r = new A(125);
    }
}
