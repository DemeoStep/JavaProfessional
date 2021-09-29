package homework2.task4;

public class Main {
    public static void main(String[] args) {
        SimpleHashMap<String, Integer> myMap = new SimpleHashMap<>();

        myMap.put("size", 12);
        myMap.put("zies", 19);
        myMap.put("siez", 15);
        myMap.put("szie", 16);
        myMap.put("addr", 12);
        myMap.put("adrd", 15);
        myMap.put("ddra", 11);
        myMap.put("dadr", 16);
        myMap.put("post", 12);
        myMap.put("psot", 15);
        myMap.put("spot", 55);
        myMap.put("sopt", 16);

        System.out.println(myMap);
        System.out.println(myMap.get("post"));
        System.out.println(myMap.remove("sopt"));
        System.out.println(myMap);
    }
}
