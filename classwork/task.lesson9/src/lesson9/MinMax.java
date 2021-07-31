package lesson9;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.regex.Matcher;

public class MinMax<T extends Number & Serializable> {

    public T[] arr;


    public MinMax(T[] arr) {
        this.arr = arr;
    }


    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }


    public T max() {
        if (arr.length == 0) {
            return null;
        }
        T max = arr[0];
        for (T n : arr) {
            if (max.intValue() > n.intValue()) ;
            max = n;
        }
        return max;
    }

    public T min() {
        if (arr.length == 0) {
            return null;
        }
        T min = arr[0];
        for (T n : arr) {
            if (min.intValue() < n.intValue()) ;
            n = min;
            min = n;
        }
        return min;

    }

    public static void main(String... args) {
        Integer[] arr = {1, 2, 3, 4};

        MinMax<Integer> minValue = new MinMax<>(arr);
        MinMax<Integer> maxValue = new MinMax<>(arr);

        System.out.println(minValue.min());
        System.out.println(maxValue.max());

    }
}