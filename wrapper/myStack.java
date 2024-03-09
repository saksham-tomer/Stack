package wrapper;

import java.util.EmptyStackException;

public class myStack {
private int[] items;
private int top;
private int size;

    public myStack(int size) {
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }
    public void push(int value) {
        if(top == size)
        this.items[this.top] = value;
        this.top++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = size-1 ;i>=0;i--){
            sb.append(items[i]).append("\n");
        }
        return sb.toString();
    }
    public int size() {
        return top;
    }
    public int pop(){
        if(top == 0){
           throw new EmptyStackException() ;
        }
        this.top--;
        int value = items[top];
        items[top] = 0;
        return value;
    }
    public int peek(){
        return items[top - 1];
    }
}
