package ComprePrac;

import java.util.Scanner;

class NestedTryDemo
{

    public static void main(String org[])
    {
        try{
            int b=100;
            System.out.println("outer try");
            try{ int d=b/0; }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e); }
            System.out.println("end of inner try");
        }
        catch(Exception e)
        { System.out.println(e); }
        System.out.println("Last statement in main metod:");
    }
}

public class NestedTry {
}
