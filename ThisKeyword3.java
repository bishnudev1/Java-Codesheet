class A{
    A(){
        this(25);
    }
    A(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        A r = new A(125);
    }
}
