package homework6.task2;

/**
 * @author Alexey Goryainov
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.setA(5);
        calc.setB(3);

        System.out.println(calc.plus());
        System.out.println(calc.minus());
        System.out.println(calc.div());
        System.out.println(calc.mult());

        calc.setB(0);

        System.out.println(calc.div());
    }
}
