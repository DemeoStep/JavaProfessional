package homework5.task4;

public class Animal {
    private String name = "Черепаха";
    private int age = 120;
    private double tailLength = 10.4;

    @Override
    public String toString() {
        return "Animal:\n\t" +
                "name = \"" + name + '\"' +
                ", age = " + age +
                ", tailLength = " + tailLength;
    }
}
