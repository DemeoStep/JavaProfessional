package homework6.task3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Annotation[] annotations = First.class.getAnnotations();

        for (Annotation anno : annotations) {
            System.out.println(anno);
        }
    }
}
