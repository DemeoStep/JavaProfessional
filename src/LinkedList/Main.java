package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> nativeList = new LinkedList<>();
//
//        nativeList.add("first");
//        nativeList.add("second");
//        nativeList.add("third");
//        nativeList.add("fourth");
//
//        System.out.println(nativeList);
//
//        System.out.println("====================================");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        myLinkedList.add("fourth");

        myLinkedList.addFirst("addFirst");
        myLinkedList.addLast("addLast");
        myLinkedList.add(5, "addFifth");

        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());

        System.out.println("====================================");

        MyLinkedList<String> clone = myLinkedList.clone();
        clone.add("Clone");

        System.out.println(clone);
        System.out.println("size: " + clone.size());

        //myLinkedList.clear();
        myLinkedList.addLast("Original");
        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());

        int myNum = 5;
        String myString = "Original";
        String myString2 = "someString";

        System.out.println(myLinkedList.contains(myNum));
        System.out.println(myLinkedList.contains(myString));
        System.out.println(myLinkedList.contains(myString2));

        System.out.println(myLinkedList.get(7));
        myLinkedList.add(6, "first");

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.indexOf("first"));
        System.out.println(myLinkedList.lastIndexOf("first"));

        System.out.println(myLinkedList.remove(5));
        System.out.println(myLinkedList);
    }
}
