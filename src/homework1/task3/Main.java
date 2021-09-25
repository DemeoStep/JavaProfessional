package homework1.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Double[] arr = new Double[] { 11d,22d,33d,44d,55d,55d,90.4,4d,78d};

        SortingTheOddWay.sortItOut(arr);

        System.out.println(Arrays.toString(arr));

    }
}
