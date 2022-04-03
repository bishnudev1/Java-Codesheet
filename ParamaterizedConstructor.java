
class A{
    int a;
    int b;

    A(int x,int y){
        a = x;
        b = y;
    }

    A(int x,String name){
        System.out.println(x + " " + name);;
    }

    void Display(){
        System.out.println(a + " " + b);
    }
}

class B{
    public static void main(String[] args) {
        A ref = new A(100,200);
        ref.Display();
        A r = new A(25,"Bishnudev");
    }
}

// We can use more than one Constuctors but Parameters data types should be different and Primitive