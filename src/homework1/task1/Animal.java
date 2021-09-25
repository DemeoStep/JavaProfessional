package homework1.task1;

public class Animal implements Comparable {
    private String breed;
    private int weight;
    private int speed;
    private int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        String space = " ";
        while (this.breed.length() + space.length() < 15) {
            space += " ";
        }

        return this.breed + space + this.speed +
                "\t\t" + this.price + "\t\t" + this.weight;
    }

    @Override
    public int compareTo(Object obj) {
        if (obj.getClass() != this.getClass()) {
            throw new ClassCastException();
        }

        Animal animal = (Animal) obj;

        int speed = this.speed - animal.speed;

        if (speed == 0) {
            int price = this.price - animal.price;
            if (price == 0) {
                int weight = this.weight - animal.weight;
                if (weight == 0) {
                    return this.breed.compareTo(animal.breed);
                } else {
                    return weight;
                }
            } else {
                return price;
            }
        }

        return speed;
    }
}
