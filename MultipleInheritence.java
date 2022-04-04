interface Morning{
    // Calling Same Methods
    void Greet();
    //Calling Different Methods
    void Show();
}

interface Noon{
    //Calling Same Methods
    void Greet();
    //Calling Diffrerent Methods
    void Display();
}

class Test implements Morning,Noon{
    public void Greet(){
        System.out.println("Good Morning & Good Noon");
    }
    public void Show(){
        System.out.println("Interface A");
    }
    public void Display(){
        System.out.println("Interface B");
    }
    public static void main(String[] args) {
        Test T = new Test();
        T.Greet();
        T.Show();
        T.Display();
    }
}
