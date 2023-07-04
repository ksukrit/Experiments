package ComprePrac;

interface Inter{
    int type = 0;
}

class A{
    A(int a){
        System.out.println("A");
    }

    void display(){
        System.out.println("A display");
    }
}

class B extends A{
    B(){
        super(10);
        System.out.println("B");
    }
}

class C extends B implements Inter{
    C(){
        System.out.println("C" + type);
    }

    final void print(){
        System.out.println("C print");
    }

    final void print(int n){
        System.out.println(n);
    }

    void add()
    {
    }
    void add(int x,int y)
    {

    }

    void display(){
        System.out.println("C display");
    }
}


public class InheritancePrac {
    public static void main(String[] args) {
        A c = new C();
        ((C) c).print(1);
    }
}
