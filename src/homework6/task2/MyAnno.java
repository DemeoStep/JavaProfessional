package homework6.task2;

import java.lang.annotation.*;

/**
 * @author Alexey Goryainov
 * @version 1.0
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface MyAnno {
    int a() default 0;

    int b() default 0;
}
