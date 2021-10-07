package homework6.task2;

/**
 * @author Alexey Goryainov
 * @version 1.0
 */

public class Calculate {
    /**
     * First number
     */
    private int a;

    /**
     * Second number
     */
    private int b;

    /**
     * Default constructor
     */
    public Calculate() {
    }

    /**
     * Construtor with parameters
     *
     * @param a int
     * @param b int
     */
    public Calculate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Returns value of a
     *
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * Sets value of a
     *
     * @param a int
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Returns value of b
     *
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * Sets value of b
     *
     * @param b int
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * Returns summ of a and b
     *
     * @return int
     */
    @MyAnno(a = 4, b = 7)
    public int plus() {
        return a + b;
    }

    /**
     * Returns difference of a and b
     *
     * @return int
     */
    @MyAnno(a = 4, b = 7)
    public int minus() {
        return a - b;
    }

    /**
     * Returns a divided by b (throws DivisionByZero exception if b = 0)
     *
     * @return double
     */
    @MyAnno(a = 4, b = 7)
    public double div() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }

    /**
     * Returns multiplication of a and b
     *
     * @return int
     */
    @MyAnno(a = 4, b = 7)
    public int mult() {
        return a * b;
    }

}
