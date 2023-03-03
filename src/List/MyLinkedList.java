package List;

public class MyLinkedList {
    private Node head;
    private int n_items;

    public boolean add(int n){
        Node nodo = new Node(n, head);
        head = nodo;
        n_items ++;
        return true;
    }

    public void add(int n, int index){
        n_items ++;
        Node nodo = head;
        int cont = n_items - 1;
        if (index == 0){
            add(n);
        }
        while(cont != index){
            nodo = nodo.getNext();
            cont --;
        }
        Node node = new Node(n, nodo.getNext());
        nodo.setNext(node);

    }

    public void clear(){
        this.head = null;
        n_items = 0;
    }

    public int size(){
        return n_items;
    }

    public boolean contains(int n){
        Node nodo = head;
        while (nodo != null){
            if (nodo.getInfo() == n)
                return true;
            nodo = nodo.getNext();
        }
        return false;
    }

    public int get(int index){
        Node nodo = head;
        int cont = 0;
        while (cont != index){
            nodo = nodo.getNext();
            cont ++;
        }
        return nodo.getInfo();
    }

    public int indexOf(int n){
        int cont = 0;
        Node nodo = head;
        while (nodo != null){
            if (nodo.getInfo() == n)
                return cont;
            nodo = nodo.getNext();
            cont ++;
        }
        return -1;
    }

    public boolean isEmpty(){
        if (n_items == 0)
            return true;
        return false;
    }

    public int remove(int index){
        Node n = head;
        int cont = 0;
        while (cont != index - 1){
            n = n.getNext();
            cont ++;
        }
        int r = n.getNext().getInfo();
        n.setNext(n.getNext().getNext());
        return r;
    }

    @Override
    public String toString(){
        Node n;
        n = this.head;
        String s = "[";
        while (n != null){
            s += n.getInfo() + ", ";
            n = n.getNext();
        }
        return s.substring(0, s.length() - 2) + "]";
    }
}
