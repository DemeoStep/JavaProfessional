package homework3.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        StringBuffer srcStringBuffer = new StringBuffer("Java — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems. Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку принадлежат корпорации Oracle.\n" +
                "Приложения Java обычно транслируются в специальный байт-код, поэтому они могут работать на любой компьютерной архитектуре, для которой существует реализация виртуальной Java-машины. Дата официального выпуска — 23 мая 1995 года. Занимает высокие места в рейтингах популярности языков программирования.");

        Queue<StringBuffer> strQueue = new PriorityQueue<>(10, Comparator.comparingInt(Main::countWords));

        for (int i = 0; i < srcStringBuffer.length(); i++) {
            strQueue.offer(new StringBuffer(srcStringBuffer.subSequence(i, srcStringBuffer.indexOf(".", i) + 1).toString()));
            i = srcStringBuffer.indexOf(".", i) + 1;
        }

        while (strQueue.size() > 0) {
            System.out.println(strQueue.poll());
        }
    }

    public static int countWords(StringBuffer str) {
        int result = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result++;
            }
        }

        return result;
    }
}
