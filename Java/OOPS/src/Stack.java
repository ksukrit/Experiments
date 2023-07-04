public class Stack {
    int top;
    int maxSize;
    int[] arr;

    Stack(int maxSize){
        top = -1;
        arr = new int[maxSize];
    }

    void push(int value){
        if(top >= maxSize-1){
            return;
        }
        top++;
        arr[top] = value;
    }

    int pop(){
        if(top == -1){
            return -1;
        }
        return arr[top--];
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}
