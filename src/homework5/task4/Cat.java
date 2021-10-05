package homework5.task4;

import java.lang.reflect.Field;

public class Cat {
    private static String name = "Васька";
    private static int age = 2;
    private static double tailLength = 20.2;

    static void animalIsCat(Animal obj) throws IllegalAccessException {
        Class<?> cl = obj.getClass();

        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            switch (field.getName()) {
                case "name" -> {
                    field.setAccessible(true);
                    field.set(obj, name);
                }
                case "age" -> {
                    field.setAccessible(true);
                    field.setInt(obj, age);
                }
                case "tailLength" -> {
                    field.setAccessible(true);
                    field.setDouble(obj, tailLength);
                }
            }
        }

    }
}
