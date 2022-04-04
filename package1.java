package bishnudev;

class Package1{
    protected void Show(){
        System.out.println("Creating a User-Defined Package in Java");
    }
    // public static void main(String[] args) {
    //     A obj = new A();
    //     obj.Show();
    // }
}

// Private is not allowed through another class in Package
// Public, Default and Protected is allowed

class B{
    public static void main(String[] args) {
        Package1 obj = new Package1();
        obj.Show();
    }
}