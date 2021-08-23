package task6;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        int[] arr = new int[8];
        try {
            for (int i = 0; i < 10; i++) {
                arr[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array is small for your elements ");
        }
    }
}