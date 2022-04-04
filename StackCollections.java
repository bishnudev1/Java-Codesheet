import java.util.Stack;

class StackCollections{
    public static void main(String[] args){
        Stack<String> Name =  new Stack<>();   // LIFO
        Name.push("Bishnudev");
        Name.push("Java");
        Name.push("Khutia");

        System.out.println(Name);
        
        Name.pop();

        System.out.println(Name);
    }
}