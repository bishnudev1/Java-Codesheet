// It hides the essential information and only show limited resources to Clients
abstract class A{
    public String name = "Bishnudev Khutia";
    public int roll = 20;
    public String dept = "Computer Science & Engineering";

    public void bankDetail(){
        System.out.println("Name : " + name + "Roll : " + roll + "Department : " + dept);
    }
    abstract void hiddenDetails();
}

class B extends A{
    private double ygpa = 9.68;
    private String univerNo = "10700120026";
    private String nickName = "Sutiyaa";

    void hiddenDetails(){
        System.out.println("Last Year Marks : " + ygpa + " YGPA" + " University Roll : " + univerNo + " Nick Name " + nickName);
    }
}

class Show{
    public static void main(String[] args) {
        B obj = new B();
        obj.bankDetail();
        obj.hiddenDetails();
    }
}