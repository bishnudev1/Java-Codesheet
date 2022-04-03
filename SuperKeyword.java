class A{
    int a = 10;

    void Show(){
        System.out.println("Bishnudev Khutia");
    }
}

class B extends A{
    int a = 20;

    void displayData(){
        // It will print 20
        System.out.println(a + " ");
        // It will print 10
        System.out.println(super.a);
    }

    void Show(){
        super.Show();
        System.out.println("Excel FPS");
    }
}

class Test{
    public static void main(String[] args) {
        Encapsulation r = new Encapsulation();
        r.displayData();
        r.Show();
    }
}