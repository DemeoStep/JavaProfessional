package homework1.task3;

public class SortingTheOddWay {

    public static Double[] sortItOut(Double[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    Double tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }

            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i].intValue() % 2 == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    Double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        return array;
    }

}
