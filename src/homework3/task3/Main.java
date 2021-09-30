package homework3.task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        StringBuffer srcStringBuffer = new StringBuffer("Java — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems. Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку принадлежат корпорации Oracle.\n" +
                "Приложения Java обычно транслируются в специальный байт-код, поэтому они могут работать на любой компьютерной архитектуре, для которой существует реализация виртуальной Java-машины. Дата официального выпуска — 23 мая 1995 года. Занимает высокие места в рейтингах популярности языков программирования.");

        StringBuffer flipStringBuffer = flip(srcStringBuffer);

        System.out.println(flipStringBuffer);
    }

    private static StringBuffer flip(StringBuffer srcStringBuffer) {
        ArrayList<StringBuffer> strArr = new ArrayList<>();
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < srcStringBuffer.length(); i++) {
            strArr.add(new StringBuffer(srcStringBuffer.subSequence(i, srcStringBuffer.indexOf(".", i) + 1).toString()));
            i = srcStringBuffer.indexOf(".", i) + 1;
        }

        for (StringBuffer substr : strArr) {
            StringBuffer first = new StringBuffer(substr.substring(0, substr.indexOf(" ")));
            substr.delete(0, first.length());

            StringBuffer last = new StringBuffer(substr.substring(substr.lastIndexOf(" ") + 1, substr.length() - 1));
            substr.delete(substr.indexOf(last.toString()), substr.length() - 1);

            substr.insert(0, last);
            substr.insert(substr.length() - 1, first);

            result.append(substr);
            if (result.length() < srcStringBuffer.length()) {
                result.append(' ');
            }
        }

        return result;
    }
}
