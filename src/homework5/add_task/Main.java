package homework5.add_task;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Animal turtle = new Animal();

        System.out.println(turtle);

        Cat.animalIsCat(turtle);

        System.out.println(turtle);
    }
}
