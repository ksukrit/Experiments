class A implements Cloneable
{ public int a;
    void showSuper()
    {System.out.println(" Value of a is ::"+a);}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class B extends A
{ int b;
    void showSuper()
    {System.out.println(" Value of a is and b ::"+a);}
    void showSub()
    {System.out.println(" Value of a and b are ::"+a+"and"+b);}
}

class Line {
    int length;
    void print(){
        System.out.println("Inside Line");
    }
}

class StLine extends Line{
    void print(){
        System.out.println("Inside Stline");
    }

    void print1(){
        System.out.println("Inside Stline Print1");
    }
}


public class DemoClass implements SampleInterface {


    public static void main(String[] args) throws CloneNotSupportedException {
        A obj = new B();
        obj.showSuper();
        Line l = new StLine();
        TestMethod(l);
        A l2 = new A();
        A l3 = (A) l2.clone();
    }

    static void TestMethod(Line l){
        StLine stLine = (StLine) l;
        stLine.print();
        stLine.print1();
        Line t = l;
        t.print();
    }

    @Override
    public void add(int a) {

    }

    @Override
    public void foo(int b) {

    }
}
