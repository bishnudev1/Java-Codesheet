class Person {
    String name = "Bishnudev Khutia";
    int age = 19;

    void Hobby() {
        System.out.println("Web Developement");
    }

    void Aim() {
        System.out.println("A Successful Person");
    }

    public static void main(String[] args) {

        Person P = new Person();
        System.out.println(P.name + "\n");
        System.out.println(P.age);
        P.Hobby();
        P.Aim();
    }
}