import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

class Box {
    static {System.out.println("Static class method");}
    int length, width, height;
    int[][] twoDimArray;

    void printBoxDetails() {
        System.out.println("Box length is : "+length);
        System.out.println("Box width is : "+width);
        System.out.println("Box height is : "+height);
    }

    Box(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
}

class BoxWeight extends Box {
    int weight;
    BoxWeight(int l, int w, int h, int wt){
        super(l,w,h);
        weight = wt;
    }
}

class Shape {
    void computeArea(){}
}

class Circle extends Shape {
    void computeArea(){
        System.out.println("IN circle");
    }
}

public class Main {
    int[][] arr = new int [2][4];
    double calculateArea(double radius){
        return 3.14*radius*radius;
    }
    int dist;
    static <T> void print(T obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        //Box b=new Box(); // using default constructor
        //b.printBoxDetails();

        //print(b.height);
        Shape c = new Circle();
        String s="Hello$how$are$you"; String delim = "$";
        StringTokenizer st1 = new StringTokenizer(s,delim);
        while (st1.hasMoreTokens())
        { System.out.println(st1.nextToken()); }
//        FrameExample frameExample = new FrameExample();
        c.computeArea();
        boolean b3 = Pattern.matches("[+]*^[0-9]+", "++456");
        System.out.println("Matching status:"+b3);
        

        //AWTTest awtTest = new AWTTest();
    }
}