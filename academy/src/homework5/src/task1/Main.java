package task1;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();

        list.add("Глеб");
        list.add("Артем");
        list.add("Андрей");
        list.add("Глеб");
        list.add("Вася");

        System.out.println(list);
    }
}
