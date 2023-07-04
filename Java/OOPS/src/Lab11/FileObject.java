package Lab11;

import java.io.*;

public class FileObject {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\sample.txt");
        System.out.println(f.length());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
            bw.write("\nHello world1");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(f.isFile());
    }
}
