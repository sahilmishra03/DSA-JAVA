package Stack;

import java.util.ArrayList;
import java.util.List;

class MyCustomStack {
    List<Integer> customStack;

    MyCustomStack(int size) {
        this.customStack = new ArrayList<Integer>();
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Value removed " + customStack.remove(customStack.size() - 1));
    }

    public void push(int data) {
        customStack.add(data);
        System.out.println("Data is Inserted " + data);
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i < customStack.size(); i++) {
            System.out.print(customStack.get(i) + " ");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return customStack.get(customStack.size() - 1);
    }

    public boolean isEmpty() {
        return customStack.size() == 0;
    }

}

public class StackDemo {
    public static void main(String[] args) {
        MyCustomStack stack = new MyCustomStack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.show();
        System.out.println(stack.peek());
    }
}
