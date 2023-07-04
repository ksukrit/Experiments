package Lab11;

import java.io.BufferedInputStream;
import java.io.IOException;

public class ReadKeyboard {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);

        int c;
        String input = "";
        try {
            while( (c = bufferedInputStream.read()) != - 1){
                input += (char) c;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(input);
    }
}
