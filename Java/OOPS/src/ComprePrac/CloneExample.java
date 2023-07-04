package ComprePrac;

// Deep copying example

import java.io.Serializable;

class Temporary implements Cloneable{
    int name = 10;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Shape  implements Cloneable{
    int type = 10;
    Temporary t;

    Shape(){
        t = new Temporary();
    }

    public Object clone() throws CloneNotSupportedException {
        Shape s = (Shape) super.clone();
        s.t = (Temporary) this.t.clone();
        return s;
    }
}

class Box extends Shape implements Cloneable, Serializable
{
    int l; int b;
    Box(int x, int y){l=x;b=y;}

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class CloneExample {

    static  int i  =0;
    void demoMethod(){
        i++;
    }
    public static void main(String args[])
    {
        new CloneExample().demoMethod();
        Box b1=new Box(12,89);
        Box b2=null;
        try{b2= (Box) b1.clone();}
        catch(Exception e){System.out.println("Error in cloning");}
        b1.type = 1;
        b1.t.name = 1;
        System.out.println("B1 Box l and b are : "+b1.l+"  "+b1.b + " " + b1.type+ " " + b1.t.name);
        System.out.println("B2 Box l and b are : "+b2.l+"  "+b2.b + " " + b2.type + " " + b2.t.name);
    }
}
