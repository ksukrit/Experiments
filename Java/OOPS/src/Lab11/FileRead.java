package Lab11;

import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        int c;

        try {

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\sample.txt");
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\sample.txt"));
            String s;
            int i = 0;
            while( (s = br.readLine()) != null){
                System.out.println(s);
                i++;
            }
            while((c = fileInputStream.read()) != -1){
                System.out.print(  (char) c) ;

                if(c == '\n'){
                    i++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
