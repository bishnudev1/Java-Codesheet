import java.util.ArrayList;

class ArrayCollections{
    public static void main(String[] args){
        ArrayList<String> Name =  new ArrayList<>();
        Name.add("Bishnudev");
        Name.add("Java");
        Name.add("Khutia");

        Name.add(2,"Python");

        System.out.println(Name);
        Name.set(0, "Python");

        System.out.println(Name);

        Name.remove(3);

        System.out.println(Name.get(2));
    }
}