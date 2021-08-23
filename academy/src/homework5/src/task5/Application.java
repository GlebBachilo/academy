package task5;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static String text = "Имеется текст. Следует составить для него частотный словарь";

    public static void main(String[] args) {
        String[] strings = text.split("");
        Map<Character, Integer> frequencyDictionary = new HashMap<>();

        int counter = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    counter++;
                }
            }
            frequencyDictionary.put(strings[i].charAt(0), counter);
            counter = 0;
        }
        System.out.println(frequencyDictionary);
    }
}
