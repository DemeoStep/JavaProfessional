package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

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
        myLinkedList.addLast("addLast");
        // add(int index, E element)
        myLinkedList.add(5, "addFifth");

        // size()
        System.out.println(myLinkedList + " (size = " + myLinkedList.size() + ")");
        System.out.println();

        // clone()
        MyLinkedList<String> clone = myLinkedList.clone();
        clone.add("Clone");
        System.out.println("Clone: " + clone);

        myLinkedList.addLast("Original");
        System.out.println("Original:" + myLinkedList);

        System.out.println();
        // clear()
        clone.clear();
        System.out.println("Clear: " + clone);

        System.out.println();
        //contains(Object o)
        int myNum = 5;
        String myString = "Original";
        String myString2 = "someString";

        System.out.println("contains int{5}: " + myLinkedList.contains(myNum));
        System.out.println("contains String \"Original\": " + myLinkedList.contains(myString));
        System.out.println("contains String \"someString\": " + myLinkedList.contains(myString2));

        System.out.println();
        // get(int index)
        System.out.println("Element on index [7]: " + myLinkedList.get(7));
        // getFirst()
        System.out.println("First: " + myLinkedList.getFirst());
        // getLast()
        System.out.println("Last: " + myLinkedList.getLast());

        System.out.println();
        myLinkedList.add(6, "first");
        // indexOf(Object o)
        System.out.println("Index of \"first\": " + myLinkedList.indexOf("first"));
        // lastIndexOf(Object o)
        System.out.println("LastIndex of \"first\": " + myLinkedList.lastIndexOf("first"));

        System.out.println();
        // remove(int index)
        System.out.println("Element to remove on index [5]: " + myLinkedList.remove(5));
        System.out.println(myLinkedList);

        System.out.println();
        // remove(Object o)
        System.out.println("Element \"third\" removed: " + myLinkedList.remove("third"));

        System.out.println();
        // set(int index, E element)
        System.out.println("Element on index [size-1] to set as \"setLast\": " + myLinkedList.set(myLinkedList.size() - 1, "setLast"));
        System.out.println(myLinkedList);

        System.out.println();
        // iterator()
        Iterator<String> it = myLinkedList.iterator();

        System.out.println("Remove first element with iterator:");
        it.remove();
        System.out.println(myLinkedList);
        System.out.println();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
