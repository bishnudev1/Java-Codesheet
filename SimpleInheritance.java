class Marks{         // Super Class
    protected int roll;
    protected double marks; // Private is not allowed but Protected is allowed

    void Input(){
        System.out.println("Setting Marks For Student...");
    }
}

class Bishnudev extends Marks{      // Sub Class
    void Display(){
        roll = 20;
        marks = 9.73;

        System.out.println("Roll : " + roll + " Marks : " + marks);
    }

    public static void main(String[] args) {
        Bishnudev B = new Bishnudev();
        B.Input();
        B.Display();
    }
}