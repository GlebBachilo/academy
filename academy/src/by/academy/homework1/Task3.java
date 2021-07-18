package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введи любое число от 1 до 10 ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if (i > 1 && i < 10) {
            System.out.println("таблица числа " + i);
            for (int b = 1; b <= 10; b++) {
                System.out.println(i + "*" + b + " = " + i * b);
            }
        }else{
            System.out.println("Введено некорректное число :");
        }
        scan.close();
    }
}
