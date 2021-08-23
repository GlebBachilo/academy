package task3.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {

    private T[][] array;
    private int row = 0;
    private int size;
    private int currentElement = 0;
    private int column = 0;

    public MyIterator(T[][] array) {
        this.array = array;
        this.size = allArrayElements(array);
    }

    private int allArrayElements(T[][] array) {
        int count = 0;
        for (T[] row : array) {
            count += row.length;
        }
        return count;
    }

    @Override
    public boolean hasNext() {
        return currentElement < size;
    }

    @Override
    public T next() {
        if (currentElement >= size) {
       System.out.println("больше нету эдементов");
        }
        T element = array[row][column];
        currentElement++;
        column++;
        while (row < array.length && column >= array[row].length) {
            column = 0;
            row++;
        }
        return element;
    }
}
