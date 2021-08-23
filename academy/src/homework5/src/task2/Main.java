package task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        LinkedList<Number> linkedList = new LinkedList<>();
        addedItems(arrayList, linkedList);
        randomElements(arrayList, linkedList);
    }

    public static void addedItems(ArrayList<Number> arrayList, LinkedList<Number> linkedList) {
        for (int i = 0; i < 1_000_001; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    public static void randomElements(ArrayList<Number> arrayList, LinkedList<Number> linkedList) {
        Random rand = new Random();
        addedItems(arrayList, linkedList);
        long startTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.get(rand.nextInt(1_000_001));
        }
        long finalTimeArrayList = System.currentTimeMillis();
        System.out.println("время затраченное на ArrayList : " + (finalTimeArrayList - startTimeArrayList));

        long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.get(rand.nextInt(1_000_001));
        }
        long finalTimeLinkedList = System.currentTimeMillis();
        System.out.println("время затраченное на LinkedList : " + (finalTimeLinkedList - startTimeLinkedList));
    }
}


//взятие элементов по индексу в ArrayList значительно быстрее так в основе лежит массив из которого взятие
//элемента происходит за константное время. А в LinkedList взятие элеметна по индексу происходит путем
//прохождения по ссылкам от первого элемента до искомого .