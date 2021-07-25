package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("Введите два слова через пробел:");
                String[] array = scan.nextLine().split(" ");


                while (array[0].length() % 2 != 0 && array[1].length() % 2 != 0 && array.length != 2) {
                    System.out.println("Введены некорректные значения :");
                    array = scan.nextLine().split(" ");
                }


                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }


                String str = array[0].substring(0,array[0].length() / 2) + array[1].substring(array[1].length() / 2);
                System.out.println("-> " + str);

                scan.close();
        }
}



