package LinkedList;

import java.util.Iterator;

public class MyLinkedList<E> implements Cloneable {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean add(E e) {
        if (size == 0) {
            Node<E> node = new Node<>(e, null, null);
            this.first = node;
            this.last = node;
            this.size++;
            return true;
        }

        Node<E> node = new Node<>(e, null, this.last);
        this.last.next = node;
        this.last = node;
        this.size++;
        return true;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) throw new ArrayIndexOutOfBoundsException();

        if (index == this.size) {
            add(e);
            return;
        }

        if (index == this.size - 1) {
            Node<E> newNode = new Node<>(e, this.last, this.last.prev);
            this.last.prev.next = newNode;
            this.last.prev = newNode;
            size++;
            return;
        }

        if (index == 0) {
            Node<E> node = new Node<>(e, this.first, null);
            this.first.prev = node;
            this.first = node;
            size++;
            return;
        }

        Node<E> node = jumpTo(index);

        Node<E> newNode = new Node<>(e, node, node.prev);
        node.prev.next = newNode;
        node.prev = newNode;
        size++;
    }

    public void addFirst(E e) {
        if (size == 0) {
            add(e);
            return;
        }

        Node<E> node = new Node<>(e, this.first, null);
        this.first.prev = node;
        this.first = node;
        size++;
    }

    public void addLast(E e) {
        add(e);
    }

    public void clear() {
        this.first = null;
        this.last = null;
        size = 0;
    }


    public boolean contains(Object obj) {
        if (obj.getClass() != this.first.element.getClass()) {
            return false;
        }

        Node<E> node = this.first;

        while (node != null) {
            if (obj.equals(node.element)) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public E getFirst() {
        return this.first.element;
    }

    public E getLast() {
        return this.last.element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException();

        Node<E> node = jumpTo(index);

        return node.element;
    }

    public int indexOf(Object obj) {
        int index = -1;

        if (contains(obj)) {
            index = 0;
            Node<E> node = this.first;

            while (!obj.equals(node.element)) {
                index++;
                node = node.next;
            }
        }

        return index;
    }

    public int lastIndexOf(Object obj) {
        int index = -1;

        if (contains(obj)) {
            index = this.size - 1;
            Node<E> node = this.last;

            while (!obj.equals(node.element)) {
                index--;
                node = node.prev;
            }
        }

        return index;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException();

        Node<E> node = jumpTo(index);
        E element = node.element;

        if (size == 1) {
            this.first = null;
            this.last = null;
            size--;
            return element;
        }

        if (node == this.first) {
            this.first = node.next;
            this.first.prev = null;
            this.size--;
            return element;
        }

        if (node == this.last) {
            this.last = node.prev;
            this.last.next = null;
            this.size--;
            return element;
        }

        node.next.prev = node.prev;
        node.prev.next = node.next;

        return element;
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }

        remove(indexOf(obj));
        return true;
    }

    public E set(int index, E element) {
        Node<E> node = jumpTo(index);
        E e = node.element;

        node.element = element;
        return e;
    }

    public Iter iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<E> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public E next() {
            Node<E> node = jumpTo(cursor);
            if (hasNext()) {
                cursor++;
            }
            return node.element;
        }

        @Override
        public void remove() {
            MyLinkedList.this.remove(cursor);
        }
    }


    private Node<E> jumpTo(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException();

        Node<E> node;

        if (index <= (size / 2)) {
            node = this.first;
            int i = 0;
            while (i < index) {
                node = node.next;
                i++;
            }
        } else {
            node = this.last;
            int i = this.size;
            while (i > index + 1) {
                node = node.prev;
                i--;
            }
        }

        return node;
    }

    @Override
    public MyLinkedList<E> clone() {
        try {
            MyLinkedList clone = (MyLinkedList) super.clone();
            clone.first = null;
            clone.last = null;
            clone.size = 0;

            Node<E> node = this.first;

            while (node != null) {
                clone.add(node.element);
                node = node.next;
            }

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        Node<E> node = this.first;
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");

        while (node != null) {
            buffer.append(node.element.toString());
            if (node.next != null) {
                buffer.append(", ");
            }
            node = node.next;
        }
        buffer.append("]");

        return buffer.toString();
    }
}
