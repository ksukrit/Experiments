import java.util.Scanner;

class Box {
    int length, width, height;
    void printBoxDetails() {
        System.out.println("Box length is : "+length);
        System.out.println("Box width is : "+width);
        System.out.println("Box height is : "+height);
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
    double calculateArea(double radius){
        return 3.14*radius*radius;
    }

    static <T> void print(T obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Box b=new Box(); // using default constructor
        b.printBoxDetails();
        print(b.height);
        Shape c = new Circle();
        c.computeArea();
    }
}