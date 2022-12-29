package PPJ21;

import PPJ21.StackExceptions.*;

public class MyStack {
    private Student[] data;
    private int currentIndex;

    public MyStack(int initialSize) {
        this.data = new Student[initialSize];
        this.currentIndex = -1;
    }

    public MyStack() {
        this(10);
    }

    public Student pop() {
        if (currentIndex == -1) {
            throw new StackEmptyException("No more elements left in the stack!");
        }
        return data[currentIndex--];
    }

    public void push(Student element) {
        if (currentIndex + 1 >= data.length) {
            throw new StackFullException("Stack is already full!");
        }

        currentIndex++;
        data[currentIndex] = element;
    }

    public int getSize() {
        return currentIndex + 1;
    }

}
