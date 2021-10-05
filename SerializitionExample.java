import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializitionExample {

    int height;
    int lenth;
    int area;

    void setLenth(int lenth) {
        this.lenth = lenth;
    }

    void setHeight(int height) {
        this.height = height;
    }

    void getArea() {
        System.out.println("the area is " + lenth * height);
    }

    public static void main(String[] args) {
        SerializitionExample example = new SerializitionExample();
        example.setLenth(30);
        example.setHeight(20);
        example.getArea();
        try {
            FileOutputStream fl = new FileOutputStream("serializition.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fl);
            obj.writeObject(example);
            obj.close();
        } catch (FileNotFoundException e) {
            System.out.println("object data is not  written in file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("file not created");
            e.printStackTrace();
        }

    }
}
