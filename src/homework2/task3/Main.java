package homework2.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Введите город проживания: ");
            String city = input.nextLine();

            System.out.print("Введите фамилию: ");
            String name = input.nextLine();

            map.put(name, city);
        }

        System.out.print("Введите искомый город: ");
        String value = input.nextLine();

        if(map.containsValue(value)) {
            System.out.println("В городе " + value + " проживают:");
            for (Map.Entry<String, String> entry: map.entrySet()) {
                if(entry.getValue().equals(value)) {
                    System.out.println(entry.getKey());
                }
            }
        } else {
            System.out.println("Нет данных по этому городу");
        }
    }
}
