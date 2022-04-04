import java.util.ArrayDeque;

class ArrayDequeCollections{
    public static void main(String[] args){
        ArrayDeque<String> Name =  new ArrayDeque<>();   // FIFO
        Name.add("Bishnudev");
        Name.add("Java");
        Name.add("Khutia");

        System.out.println(Name);
        
        Name.remove();

        System.out.println(Name);
    }
}