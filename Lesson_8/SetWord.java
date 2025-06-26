import java.util.*;

public class SetWord {
    public static void main(String[] args) {
        ArrayList<String> wordsArr = new ArrayList<>(Arrays.asList("turtle", "cat", "dog", "turtle", "racoon", "lion", "fox",
                "dog", "lion", "wolf", "turtle", "dog", "bear", "snake", "turtle"));

        HashSet<String> wordsSet = new HashSet<>(wordsArr);
        System.out.println(wordsSet);

        HashMap<String, Integer> wordsMap = new HashMap<>();

        for (String w : wordsArr) {
            if (!wordsMap.containsKey(w)) {
                wordsMap.put(w, 1);
            } else {
                wordsMap.put(w, wordsMap.get(w) + 1);
            }
        }

        for (Map.Entry<String, Integer> m : wordsMap.entrySet()) {
            System.out.println("Word \"" + m.getKey() + "\" counts " + m.getValue() + " time(s).");
        }
    }
}
