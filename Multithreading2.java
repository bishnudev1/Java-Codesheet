class Multithreading2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.print("Bishnudev\n");
        }
    }
}

class B{
    public static void main(String[] args) {
        Multithreading2 M = new Multithreading2();
        Thread T = new Thread(M);
        T.start();
        for(int i=0;i<5;i++){
            System.out.print("Arnab\n");
        }
    }
}