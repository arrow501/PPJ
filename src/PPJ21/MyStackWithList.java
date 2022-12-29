package PPJ21;

import PPJ21.StackExceptions.*;

class MyStackWithList {
    public class Node {
        Student data;
        Node next;

        public Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;
    private int MAX_SIZE;

    public MyStackWithList(int initialSize) {
        this.top = null;
        this.size = 0;
        this.MAX_SIZE = initialSize;
    }

    public void push(Student data) throws StackFullException {
        if (size >= MAX_SIZE) {
            throw new StackFullException("Stack is full!");
        }

        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Student pop() throws StackEmptyException {
        if (this.isEmpty()) {
            throw new StackEmptyException("No more elements left in the stack");
        }
        Student data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }
}