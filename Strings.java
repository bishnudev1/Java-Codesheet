public class Strings {
    public static void main(String[] args) {
        String str = "Bishnudev Khutia";
        String str3 = "Bishnudev Khutia";
        String str2 = new String("Bishnudev Khutia");
        if(str == str3){   //This method will not work as they are different variables
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }

        System.out.println(str.length());
        System.out.println(str2.length());

        // As we are making string 2 with new Constructor thus it's location will be different than Heap so you have to compare it with any other string with equals function  

        if(str.equals(str2)){
            System.out.print("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }

        // Immutable behaviour of Strings in Java
        String str4 = "Bishnudev";
        String str5 = "Khutia";
        str4.concat(str5);
        System.out.println(str4);

        String str6 = str4.concat(str5);
        System.out.println(str6);

        // String values will remain same if we don't store it to an another variables...Thus Java Strings are Immutable
    }
}
