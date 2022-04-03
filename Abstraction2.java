abstract class animal{
    void Legs(){
        System.out.println("All Animals Has 4 Legs");
    }
    abstract void sound();
    abstract void eat();
}

class Dog extends animal{
    void sound(){
        System.out.println("Bow Bow...");
    }
    void eat(){
        System.out.println("I eat meat...");
    }
}

class Cat extends animal{
    void sound(){
        System.out.println("Meaow Meaow...");
    }
    void eat(){
        System.out.println("I eat milk...");
    }
}

class Test{
    public static void main(String[] args) {
        Dog D = new Dog();
        Cat C = new Cat();
        D.Legs();
        D.eat();
        D.sound();
        C.Legs();
        C.eat();
        C.sound();
    }
}