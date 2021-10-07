package homework6.add_task;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MathAnnoHolder.class)
@interface MathAnno {
    int num1() default 0;

    int num2() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MathAnnoHolder {
    MathAnno[] value();
}
