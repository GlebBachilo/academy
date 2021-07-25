package by.academy.homework2;

import java.util.Scanner;


public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        scan.nextLine();

        int min;
        int counter;
        int minNumber;
        int chСounter = 0;

        {
            counter = 0;
            minNumber = 0;
            min = Integer.MAX_VALUE;
        }

        String[] str = new String[n];


        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter the word :");
            str[i] = scan.nextLine();
            for (int j = 0; j < str[i].length(); j++) {
                //проверка найден ли символ в позиции j+1  если да увеличиваем счетчик
                if (str[i].indexOf(str[i].charAt(j), j + 1) != -1) {
                    counter++;
                }
            }

            chСounter = str[i].length() - counter;
            if (chСounter < min) {
                min = counter;
                minNumber = i;
            }
        }
        System.out.println("word with fewer distinct characters : " + str[minNumber]);
    }
}

