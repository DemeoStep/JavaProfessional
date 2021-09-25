package homework1.task1;

public class Car implements Comparable<Car> {
    private int speed;
    private int price;
    private String model;
    private String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        String space = " ";
        while (this.model.length() + space.length() < 15) {
            space += " ";
        }
        return this.model + space + this.speed + "\t\t" + this.price + "\t\t" + this.color;
    }

    @Override
    public int compareTo(Car car) {

        int speed = this.speed - car.speed;

        if (speed == 0) {
            int price = this.price - car.price;
            if(price == 0) {
                int model = this.model.compareTo(car.model);
                if(model == 0) {
                    return this.color.compareTo(car.color);
                } else {
                    return model;
                }
            } else {
                return price;
            }
        }

        return speed;

    }
}
