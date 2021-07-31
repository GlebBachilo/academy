package lesson9;

import java.io.Serializable;

public class Task2<T extends Number & Serializable & Comparable<T>> {
    public T[] items;


    public Task2(T[] items) {
        super();
        this.items = items;
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    public Double average() {
        if (items.length == 0) {
            return 0.0;
        }
        double sum = 0;

        for (Number n : items) {
            sum += n.doubleValue();
        }
        return sum / items.length;

    }

    public boolean compare(Task2<?> anotherAvgBox) {
        double myAvg = average();
        double anotherAvg = anotherAvgBox.average();
        return myAvg ==anotherAvg;
    }


    public static void main(String... args) {
        Double[] array = {1.1, 2.2, 2.3};
        Task2<Double> dTask2 = new Task2<>(array);

        Integer[] arrayI = {1, 2, 3, 4};
        Task2<Integer> iTask2 = new Task2<>(arrayI);

        System.out.println(dTask2.average());
        System.out.println(iTask2.average());

        System.out.println(dTask2.compare(dTask2));
        System.out.println(dTask2.compare(iTask2));
    }


}
