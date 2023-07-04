package Lab11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputInputDemo {
    public static void main(String[] args) {
        FileOutputStream f = null;
        try {
            f = new FileOutputStream("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\output.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(f);
        try {
            dataOutputStream.writeChars("Hello world");
            dataOutputStream.flush();
            dataOutputStream.close();
            f.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
