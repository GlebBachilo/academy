package homework4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyCustomArrayList<T> implements Iterable<T> {

    private T[] items;
    private int counter = 0;

    public MyCustomArrayList() {
        super();
        this.items = (T[]) new Object[16];
    }

    public MyCustomArrayList(int size) {
        super();
        this.items = (T[]) new Object[size];
    }

    public MyCustomArrayList(T[] item) {
        super();
        this.items = items;
        this.counter = items.length - 1;
    }

    public void add(T obj) {
        if (counter == items.length - 1) {
            growth();
        }
        items[counter++] = obj;
    }

    public T getFirst() {
        if (counter == 0) {
            System.out.println("Элементы не найдены");
            return null;
        }
        return items[0];
    }

    private void growth() {
        T[] arrCopy = Arrays.copyOf(items, items.length * 2 + 1);
        items = arrCopy;
    }

    public T get(int index) {
        if (index >= counter || index < 0) {
            System.out.println("Выход за пределы массива");
            return null;
        } else {
            return items[index];
        }
    }

    public T[] getItems() {
        return items;
    }

    public T getLast() {
        if (items[counter - 1].equals(null)) {
            System.out.println("Массив пустой");
            return null;
        } else {
            return items[counter - 1];
        }
    }

    public int lastAddIndex() {
        if (counter == 0) {
            System.out.println("Элементы не добавлены");
            return counter;
        }
        return counter - 1;
    }

    public void remove(int index) {
        if (index >= counter || index < 0) {
            System.out.println("Выход за пределы массива");
            return;
        }

        if (index < counter) {
            System.arraycopy(items, index + 1, items, index, counter - index - 1);
        }
        items[--counter] = null;
    }

    public void set(int index, T item) {
        if (index >= items.length || index < 0) {
            System.out.println("Выход за пределы массива");
            return;
        }
        if (index >= counter) {
            items[counter++] = item;
        } else {
            items[index] = item;
        }
    }

    public void remove(T object) {
        for (int i = 0; i < counter; i++) {
            if (object.equals(items[i])) {
                if (i < counter) {
                    System.arraycopy(items, i + 1, items, i, counter - i - 1);
                    items[--counter] = null;
                    return;
                }
            }
        }
    }

    @Override
    public MyCustomIterator<T> iterator() {
        return new MyCustomIterator<>(lastAddIndex() + 1, getItems());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCustomArrayList<?> that = (MyCustomArrayList<?>) o;
        return counter == that.counter &&
                Arrays.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(counter);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyCustomArrayList{");
        sb.append("items=").append(Arrays.toString(items));
        sb.append(", counter=").append(counter);
        sb.append('}');
        return sb.toString();
    }
}


