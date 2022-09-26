public class Student {
    int age;

    static int count = 0;
    Student(int age){
        this.age = age;
        System.out.println(age);
    }

    void printAge(){
        System.out.println(age);
        count++;
    }

    static void getStudent() throws IllegalAccessException {
        throw new IllegalAccessException("Not initialized");
    }
}
