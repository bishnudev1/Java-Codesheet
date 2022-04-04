import java.io.FileWriter;

class fileWriter{
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\Bishnudev\\Desktop\\New.txt");

            try{
                f.write("Myself Bishnudev Khutia. I Love Programming and Travel");
            }
            finally{
                f.close();
            }
            System.out.println("File Writting Task Has Been Succeed !");
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
}