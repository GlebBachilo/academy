package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Application {
    private static Random rand = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        allMarks(marks);
        System.out.println(marks);

        int value, maxMark = marks.get(0);
        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            value = iterator.next();
            if (value > maxMark) {
                maxMark = value;
            }
        }
        System.out.println(maxMark);
    }

    public static <T> void allMarks(List<Integer> anything) {
        for (int i = 0; i < 24; i++) {
            anything.add(rand.nextInt(10) + 1);
        }
    }
}
