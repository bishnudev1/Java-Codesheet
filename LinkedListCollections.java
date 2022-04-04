import java.util.LinkedList;

class LinkedListCollections{
    public static void main(String[] args){
        LinkedList<String> Name =  new LinkedList<>();
        Name.add("Bishnudev");
        Name.add("Java");
        Name.add("Khutia");

        System.out.println(Name);

        Name.addFirst("Hello");
        Name.addLast("Bye");

        Name.set(0, "Python");

        System.out.println(Name);

        Name.removeFirst();

        Name.removeLast();

        Name.remove(3);

        System.out.println(Name.get(2));
    }
}