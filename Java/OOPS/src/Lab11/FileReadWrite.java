package Lab11;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        int c;
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\sample.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\output.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            StringBuffer stringBuffer = new StringBuffer();
            while((c = fileInputStream.read()) != -1){
                fileOutputStream.write(  (char) c);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
