package homework4;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayListDemo {
    public static void main(String[] args) {
        MyCustomArrayList<String> array1 = new MyCustomArrayList<>();
        MyCustomArrayList<String> array2 = new MyCustomArrayList<>(3);
        System.out.println(Arrays.toString(array1.getItems()));
        System.out.println(Arrays.toString(array2.getItems()));
        System.out.println(array1.getFirst());
        array1.add("Глеб");
        array1.add("Артем");
        array1.add("Максим");
        array1.add("Женя");

        System.out.println(Arrays.toString(array1.getItems()));
        array1.remove((Integer) 3);
        System.out.println(Arrays.toString(array1.getItems()));
        array1.set(2,"Андрей");
        array2.set(2,"Андрей");
        System.out.println(Arrays.toString(array1.getItems()));
        System.out.println(Arrays.toString(array2.getItems()));
        System.out.println(array1.getLast());
        System.out.println();
        System.out.println("Задание 3");
        Iterator<String> iterator = array1.iterator();
        while (iterator.hasNext()) {
            System.out.print(" | " + iterator.next() + " | ");
        }
    }
}
