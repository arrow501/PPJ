package Extras.Shapes;

public class Node {
    private Figure data;
    private Node next;
    private Node prev;

    public Node(Figure data) {
        this.data = data;
    }

    public Figure getData() {
        return this.data;
    }

    public void setData(Figure data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

}
