package homework2.task4;

public class Main {
    public static void main(String[] args) {
        SimpleHashMap<String, Integer> myMap = new SimpleHashMap<>();

        myMap.put("size", 12);
        myMap.put("siez", 15);
        myMap.put("szie", 16);
        myMap.put("addr", 12);
        myMap.put("adrd", 15);
        myMap.put("dadr", 16);
        myMap.put("post", 12);
        myMap.put("psot", 15);
        myMap.put("sopt", 16);

        System.out.println(myMap);

        System.out.println(myMap.get("sost"));
        System.out.println(myMap.get("post"));
    }
}
