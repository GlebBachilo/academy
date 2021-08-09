package homework4;

import java.util.Iterator;

public class MyCustomIterator<T> implements Iterator<T> {
    private int num = 0;
    private int size = 0;
    private T[] items;

    public MyCustomIterator(int size, final T[] items) {
        super();
        this.size = size;
        this.items = items;
    }


    public boolean hasNext() {
        if (size == 0) {
            System.out.println("Элементы не найдены");
            return false;
        }
        return num < size;
    }

    @Override
    public T next() {
        return (T) items[num++];
    }
}
