package task3;


import task3.iterator.MyIterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
       Integer[][] matrix = {{1,2,3}, {}, {10,9}, {8}};
        Iterator<Integer> iterator = new MyIterator<>(matrix);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.next();
    }
}