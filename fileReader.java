import java.io.FileReader;
import java.io.IOException;

class fileReader{
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("C:\\Users\\Bishnudev\\Desktop\\New.txt");
            try{
                int i;
                while((i=f.read()) != -1){
                    System.out.println((char)i);
                }
            }
            finally{
                f.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
