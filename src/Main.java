import List.MyLinkedList;

import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        LinkedList ll = new LinkedList();
        mll.add(44);
        mll.add(47);
        mll.add(98);
        mll.add(12);
        mll.add(76);
        mll.add(17,3);
        ll.add(12);
        ll.add(6);
        ll.add(65);
        System.out.println(mll);
        System.out.println(ll);
        System.out.println(mll.contains(17));
        System.out.println(mll.get(2));
        System.out.println(mll.indexOf(18));
        System.out.println(mll.isEmpty());
        System.out.println(mll.remove(3));
    }
}