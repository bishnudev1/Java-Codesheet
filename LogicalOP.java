public class LogicalOP {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //Comparison Operators

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a < b);

        //Logical Operators

        System.out.println(a == b && a !=b);
        System.out.println(a != b || a == b);
        System.out.println(!(a<b));

        // Increment and Decrement Operator

        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b--);
        System.out.println(--b);

        //Assigned Operator
        a += 10;
        b -= 5;
        System.out.println(a);
        System.out.println(b);

    }
}
