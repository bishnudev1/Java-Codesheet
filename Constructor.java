import java.io.Console;
import java.util.jar.Attributes.Name;
//It is also an example of Default Constructor

class A{

    int a;
    String name;

    A(){
        a = 10;
        name = "Bishnudev Khutia";
    }

    void ShowData(){
        System.out.println(a + " " + name);
    }
}

class B{
    public static void main(String[] args) {
        A ref = new A();
        
        //We can use Constructor Variables without creating objects
        A.ShowData();
    }
}