
// Multithreading by extending Threads

class Multithreading1 extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.print("Bishnudev\n");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Test{
    public static void main(String[] args) throws InterruptedException{
        Multithreading1 M = new Multithreading1();
        M.start();
        for(int i=1;i<=5;i++){
            System.out.print("Arnab\n");
            Thread.sleep(1000);
        }
    }
}
