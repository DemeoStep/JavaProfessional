package homework1.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Animal("King Penguin", 11, 8, 11000);
        Animal swallow = new Animal("Swallow", 11, 8, 10000);
        Animal pigeon = new Animal("Pigeon", 15, 8, 11000);
        Animal albatros = new Animal("Albatros", 15, 8, 11000);
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 12, 8, 10000);
        Animal someAnimal = new Animal("Animal", 7, 25, 5000);

        System.out.println("{breed}\t\t  {speed}  {price}\t{weight}");

        Animal[] animals = {someAnimal, pigeon, cat, dog, bird, swallow, albatros};

        Arrays.sort(animals);   // ClassCastException w/o Comparable

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\n==========================\n");
        System.out.println("{model}\t\t {speed}\t{price}\t  {color}");

        Car car1 = new Car(200, 20000, "BMW", "black");
        Car car2 = new Car(200, 20000, "Audi", "silver");
        Car car3 = new Car(180, 10000, "Opel", "white");
        Car car4 = new Car(280, 100000, "Ferrari", "red");
        Car car5 = new Car(280, 100000, "Lamborgini", "yellow");
        Car car6 = new Car(280, 100000, "Ferrari", "white");
        Car car7 = new Car(200, 20000, "BMW", "blue");

        Car[] cars = {car4, car7, car5, car1, car3, car6, car2};

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
