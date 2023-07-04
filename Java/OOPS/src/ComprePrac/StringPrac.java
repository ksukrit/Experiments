package ComprePrac;

import java.awt.*;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringPrac {

    public static void main(String[] args) {
        boolean b = Pattern.matches("[ab][c]*[a]+","aba");
        System.out.println(b);
    }
}
