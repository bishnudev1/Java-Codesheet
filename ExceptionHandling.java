class A {

    public static void main(String[] args) {
        System.out.println("Main Method Started...");

        int a = 10;
        int b = 0;
        int c;

        try {
            c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("A Number Can't be Divisible By 0 " + e);
        }

        System.out.println("Main Method Ended...");
    }
}