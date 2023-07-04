package Lab8;

import java.util.regex.*;

public class SecondProb {

    public static void main(String[] args) {
        if(Pattern.matches("[1-7]{1}[0-9]{5}",args[0])){
            System.out.println("Valid zipcode");
        }else{
            System.out.println("Invalid zipcode");
        }
    }
}
