import java.util.HashMap;

public class Lesson_8 {
    public static void main(String[] args) {
        HashMap<String, String> phoneMap = new HashMap<>();
        PhoneBook.add("Ivanov", "555-88-77", phoneMap);
        PhoneBook.add("Bulgakov", "444-88-99", phoneMap);
        PhoneBook.add("Ivanov", "333-55-88", phoneMap);
        PhoneBook.add("Pushkin", "222-00-55", phoneMap);
        PhoneBook.add("Ivanov", "777-55-99", phoneMap);
        PhoneBook.add("Fet", "111-88-33", phoneMap);
        PhoneBook.add("Brodskiy", "111-88-33", phoneMap);

        PhoneBook.get("Ivanov", phoneMap);
        System.out.println(phoneMap.values());

        for (HashMap.Entry<String, String> m : phoneMap.entrySet()) {
            System.out.println(m.getKey() + " has number(s): " + m.getValue());
        }
    }
}
