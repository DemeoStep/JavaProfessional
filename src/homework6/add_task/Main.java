package homework6.add_task;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = MyMath.class.getMethod("mathSum", int.class, int.class);

        MathAnno[] annos = method.getAnnotationsByType(MathAnno.class);

        MyMath math = new MyMath();

        method.invoke(math, annos[0].num1(), annos[1].num2());
    }

}
