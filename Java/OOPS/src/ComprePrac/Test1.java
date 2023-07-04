package ComprePrac;


abstract class SuperClass{
    abstract void print();
    abstract void add();
}

class SubClass extends SuperClass{
    @Override
    void print() {

    }

    @Override
    void add() {

    }
}


interface I1 {
    String name = "Sukrit";
    void add();
}

class Line
{
    int length;
    Line(int l)
    { length=l;}
    void doubleVal( int a)
    { a=a*2;}
    void doubleLength(Line l)
    { l.length=l.length*2;}
}

public class Test1  {

    String name = "Hello World";


    public static void main(String[] args) {

        Line l1=new Line(2);
        System.out.println("Call by value :");
        System.out.println("value of Line length before doubled is: "+
                l1.length);
        l1.doubleVal(l1.length);
        System.out.println("value of Line length after doubled is: "+
                l1.length);
        System.out.println("Now Call by reference :");
        System.out.println("length of the line before doubled is: "+ l1.length);
        l1.doubleLength(l1);
        System.out.println("length of the line after doubled is: "+ l1.length);
        Test1 t = new Test1();
        int n = t.fact(10);

    }

    protected int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    @Override
    public boolean equals(Object obj) {
        Test1 t = (Test1) obj;
        return t.name.equals(this.name);
    }
}
