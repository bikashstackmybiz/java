import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateAfile {

    public static void main(String[] args) {

        File file = new File("bkr.txt");
        try {
            file.createNewFile();                   // to create file
        } catch (Exception e) {
            System.out.println("unable to create file");
        }
        try {
            FileWriter writeOnFile = new FileWriter("bkr.txt");
            writeOnFile.write("my name is bikash");             // to write anything on file
            writeOnFile.close();
        } catch (IOException e) {
            System.out.println("unable to writwe on file");
            e.printStackTrace();
        }
        try {
            Scanner sc = new Scanner(file);                 // to write conntent on file
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("unable to read what written on file");
        }

        // try {
        //     if(file.delete()){                                   // to delete the file
        //         System.out.println("file deleted ");             
        //     }
        // } catch (Exception e) {
        //     System.out.println("unable to delete file");     
        //    }

    }
}
