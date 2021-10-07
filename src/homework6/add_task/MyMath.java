package homework6.add_task;

public class MyMath {

    @MathAnno(num1 = 50)
    @MathAnno(num2 = 100)
    public static void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
