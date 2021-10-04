import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CheeckedException {
    public static void main(String args[]) {
        File CheeckedException = new File("name.txt");

        try {
            CheeckedException.createNewFile();
        } catch (Exception e) {
            System.out.println("unable to create file");
        }
        try {
            FileWriter write = new FileWriter("name.txt");
            write.write("my name is bikash and i am currently working on stackmybiz");
            write.write("  i am a cool guy");
            write.close();
        } catch (IOException e1) {
            System.out.println("unable to write anything in file");
            e1.printStackTrace();
        }
        


    }
}
