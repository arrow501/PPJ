package Extras.Shapes;

public class MyList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void add(Figure figure) {
        if (this.head == null) {
            // assign head and tail to new node
            head = new Node(figure);
            tail = head;
        } else {
            // add new node after tail
            tail.setNext(new Node(figure));
            // add prev for current tail
            tail.getNext().setPrev(tail);
            // assign the new node to tail
            tail = tail.getNext();
            size++;
        }
    }
}
