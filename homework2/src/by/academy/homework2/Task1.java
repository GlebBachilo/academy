package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два слова ");

        System.out.println("Введите 1 слово :");
        String str1 = scan.nextLine();

        System.out.println("Введите 2 слово :");
        String str2 = scan.nextLine();

        System.out.print(Task1.sravn(str1, str2));


        scan.close();
    }

    public static boolean sravn(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[256];

        char[] str1_array = str1.toCharArray();
        for (char c : str1_array) {
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = (int) str2.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
