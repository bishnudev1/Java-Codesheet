import java.io.File;
import java.io.IOException;

class createFile{
    public static void main(String[] args) throws IOException {
        File f = new File("Pictures\\new.txt");
            if(f.createNewFile()){
                System.out.println("File Successfully Created...");
            }
            else{
                System.out.println("File Already Exists...");
            }
    }
}