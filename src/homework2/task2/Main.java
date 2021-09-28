package homework2.task2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(10, new Comparator<>() {

            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });

        for (int i = 0; i < 10; i++) {
            queue.offer(new Random().nextInt(100));
        }

        System.out.println(queue);

        while (queue.size() != 0) {
            System.out.println(queue.poll());
        }
    }
}
