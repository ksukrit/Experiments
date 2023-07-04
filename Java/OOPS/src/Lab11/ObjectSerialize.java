package Lab11;

import java.io.*;
import java.util.Scanner;

class Box implements Serializable {
    int length,breadth,height;
    void printDetails(){
        System.out.println(length + " " + breadth + " " + height);
    }
}

public class ObjectSerialize {
    static Box read(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int n = ois.readInt();
            if(n != 69){
                throw new RuntimeException();
            }
            return (Box) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void write(Box b){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src\\Lab11\\object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(69);
            oos.writeObject(b);
            oos.close();
            fos.flush();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Box b = new Box();
        b.height = 10;
        b.breadth=20;
        b.length = 30;
        write(b);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Box b2 = read();
        b2.printDetails();
        if(b2 != b){
            System.out.println("Error");
        }
    }
}
