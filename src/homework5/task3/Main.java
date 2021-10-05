package homework5.task3;

import Console.Color;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cl = SomeClass.class;

        StringBuffer str = new StringBuffer();

        str.append(Color.RED + "Имя класса: " + Color.RESET + cl.getSimpleName() + "\n");
        str.append(Color.RED + "Супер класс: " + Color.RESET + (cl.getSuperclass() == null ? "none" : cl.getSuperclass().getSimpleName()) + "\n");
        str.append(Color.RED + "Конструкторы: " + Color.RESET + "\n");
        str.append(printConstructors(cl));

        str.append(Color.RED + "Поля: " + Color.RESET + "\n");

        str.append(printFields(cl));

        str.append(Color.RED + "Методы: " + Color.RESET + "\n");


        str.append(printMethods(cl));

        System.out.println(str);
    }

    private static StringBuffer printConstructors(Class<?> cl) {
        StringBuffer str = new StringBuffer();

        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        int i = 0;

        for (Constructor<?> constructor : constructors) {
            int mods = constructor.getModifiers();
            str.append("\t" + printModifiers(mods));

            str.append("constructor " + (++i) + ": (");
            Class<?>[] paramTypes = constructor.getParameterTypes();

            for (int j = 0; j < paramTypes.length; j++) {
                str.append(paramTypes[j].getSimpleName());
                if (j < paramTypes.length - 1) {
                    str.append(", ");
                }
            }

            str.append(")\n");
        }

        return str;
    }

    private static StringBuffer printMethods(Class<?> cl) {
        Method[] methods = cl.getDeclaredMethods();

        StringBuffer str = new StringBuffer();
        for (Method method : methods) {
            int mods = method.getModifiers();
            str.append("\t");
            if (!cl.getSimpleName().equals("Object")) {
                if (!method.getDeclaringClass().getSimpleName().equals("Object")) {
                    str.append(printModifiers(mods));
                    str.append(getMethodStr(method));
                }
            } else {
                str.append(printModifiers(mods));
                str.append(getMethodStr(method));
            }
        }
        return str;
    }

    private static StringBuffer printFields(Class<?> cl) throws ClassNotFoundException {
        Field[] fields = cl.getDeclaredFields();
        StringBuffer str = new StringBuffer();

        for (Field field : fields) {
            str.append("\t");

            int mods = field.getModifiers();
            str.append(printModifiers(mods));

            if (field.getType().isPrimitive()) {
                str.append(field.getGenericType() + " " + field.getName() + "\n");
            } else {
                if (field.getGenericType() == Class.forName("[C")) {
                    str.append(Color.GREEN + "char[]" + Color.RESET + " " + field.getName() + "\n");
                } else if (field.getGenericType() == Class.forName("[B")) {
                    str.append(Color.GREEN + "byte[]" + Color.RESET + " " + field.getName() + "\n");
                } else if (field.getGenericType() == Class.forName("[I")) {
                    str.append(Color.GREEN + "int[]" + Color.RESET + " " + field.getName() + "\n");
                } else if (field.getGenericType() == Class.forName("[Ljava.io.ObjectStreamField;")) {
                    str.append(Color.GREEN + "ObjectStreamField[]" + Color.RESET + " " + field.getName() + "\n");
                } else {
                    str.append(Color.GREEN + field.getGenericType().toString().replace("java.lang.", "").replace("java.util.", "") + Color.RESET + " " + field.getName() + "\n");
                }
            }
        }

        return str;
    }

    private static StringBuffer printModifiers(int mods) {
        StringBuffer str = new StringBuffer();

        if (Modifier.isPublic(mods)) {
            str.append("public ");
        }
        if (Modifier.isPrivate(mods)) {
            str.append("private ");
        }
        if (Modifier.isProtected(mods)) {
            str.append("protected ");
        }
        if (Modifier.isStatic(mods)) {
            str.append("static ");
        }
        if (Modifier.isAbstract(mods)) {
            str.append("abstract ");
        }
        if (Modifier.isNative(mods)) {
            str.append("native ");
        }
        if (Modifier.isAbstract(mods)) {
            str.append("abstract ");
        }
        if (Modifier.isFinal(mods)) {
            str.append("final ");
        }
        if (mods == 0) {
            str.append("default ");
        }
        return str;

    }

    private static StringBuffer getMethodStr(Method method) {
        StringBuffer str = new StringBuffer();

        str.append(method.getReturnType().getSimpleName() + " " + method.getName() + "(");

        Class<?>[] parameterTypes = method.getParameterTypes();

        for (int i = 0; i < parameterTypes.length; i++) {
            str.append(parameterTypes[i].getSimpleName());
            if (i < parameterTypes.length - 1) {
                str.append(", ");
            }
        }

        str.append(")\n");

        return str;
    }

}
