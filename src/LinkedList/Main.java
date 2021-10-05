package LinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        // add(E e)
        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        myLinkedList.add("fourth");

        // addFirst(E e)
        myLinkedList.addFirst("addFirst");
        // addLast(E e)
        myLinkedList.add("first");
        myLinkedList.addLast("addLast");
        // add(int index, E element)
        myLinkedList.add(5, "addFifth");
        System.out.println(myLinkedList);
        myLinkedList.remove(6);
        myLinkedList.remove(5);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(5));

        Iterator<String> it = myLinkedList.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }

    }
}
