import java.util.HashMap;

public class PhoneBook {
    public static void add(String key, String value, HashMap<String, String> map) {
        if (map.containsValue(value)) {
            System.out.println("ERROR! This phone number (" + value + ") already reserved. Please " +
                    "enter correct phone number.");
        } else {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + ", " + value);
            } else {
                map.put(key, value);
            }
        }
    }

    public static void get(String key, HashMap<String, String> map) {
        System.out.println(key + " has number(s): " + map.get(key));
    }
}
