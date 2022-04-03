interface vehical{
    String Name = "TVS";
    int speed = 120;

    void Start();
    void Stop();
    default void Color(){
        System.out.println("TVS Color is Red");
    }
    static void Manufacture(){
        System.out.println("Made in India");
    }
}

class Customer implements vehical{
    @Override
    public void Start(){
        System.out.println("Start() : Insert Key & Press Start");
    }
    @Override
    public void Stop(){
        System.out.println("Stop() : Exit key");
    }

    public static void main(String[] args) {
        Customer C = new Customer();
        C.Color();
        C.Start();
        C.Stop();
        System.out.println(speed);
        vehical.Manufacture();
    }
}