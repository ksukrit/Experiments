package Lab8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine(),sc.nextLine());
        System.out.println("No of tokens is " + stringTokenizer.countTokens() );
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
