class A{
    int a;
    A(int a){
        //It will give always 0
        a = a;
        //It will give the ref value ( In this case 250 )
        this.a = a;
    }
    void ShowData(){
        System.out.println(a);
    }
}

class B{
    public static void main(String[] args) {
        A ref = new A(250);
        ref.ShowData();
    }
}