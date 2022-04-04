// Method Overloading in Polymorphism

class A{
    int Add(){
        int a = 20;
        int b = 15;
        System.out.println(a+b);
        //You can return the value also in Method Overloading
        return a+b;
    }

    void Add(int x,int y){
        int z = x+y;
        System.out.println(z);
    }

    void Add(int x, double y){
        double z = x+y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        A r = new A();
        //r.Add();
        System.out.println(r.Add());
        r.Add(36, 63);
        r.Add(25, 45.6);
    }
}