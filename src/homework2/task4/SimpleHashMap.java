package homework2.task4;

import java.util.Arrays;
import java.util.Map;

public class SimpleHashMap<K, V> {
    private int size;
    private MyNode<K, V>[] table = new MyNode[10];

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    };

    public V put(K key, V value) {
        int index = hash(key);

        if(table[index] == null) {
            table[index] = new MyNode<>(key, value);
            size++;
            return value;
        }

        MyNode<K, V> node = table[index];

        while(node != null) {
            if (node.getKey().equals(key)) {
                V oldValue = node.getValue();
                node.setValue(value);
                return value;
            }

            node = node.next;
        }

        table[index] = new MyNode<>(key, value, table[index]);

        size++;
        return value;
    }

    public V get(K key) {
        int index = hash(key);

        if(table[index] != null) {
            MyNode<K,V> node = table[index];

            while(node != null) {
                if(node.getKey().equals(key)) {
                    return node.getValue();
                }
                node = node.next;
            }
        }

        return null;
    }

    public V remove(K key) {
        V value = get(key);

        int index = hash(key);

        if(table[index] != null) {
            MyNode<K,V> node = table[index];

            if(node.getKey().equals(key)) { //Если удаляемая нода первая
                table[index] = node.next;
                size--;
                return value;
            }

            while (node.next != null) { //Если удаляемая нода в середине
                if (node.next.getKey().equals(key)) {
                    node.next = node.next.next;
                    size--;
                    return value;
                }
                node = node.next;
            }

        }

        return value;
    }

    @Override
    public String toString() {
        if(size == 0) {
            return "{}";
        }

        String str = "{";

        for (MyNode<K, V> node: table) {
            if(node != null) {
                while (node != null) {
                    str += node.getKey() + "=" + node.getValue() + ", ";
                    node = node.next;
                }
            }
        }
        str = str.substring(0, str.length() - 2);
        str += "}";

        return str;
    }

    private class MyNode<K, V> implements Map.Entry<K, V> {

        private K key;
        private V value;
        MyNode<K, V> next;

        public MyNode(K key, V value, MyNode<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public MyNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public MyNode() {}

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return value;
        }

    }

}
