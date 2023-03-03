package List;

public class Node {
    private Node next;
    private int info;
    Node(){
        next = null;
        info = 0;
    }
    Node(int n, Node nodo){
        info = n;
        next = nodo;
    }

    public Node getNext() {
        return next;
    }

    public int getInfo() {
        return info;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}
