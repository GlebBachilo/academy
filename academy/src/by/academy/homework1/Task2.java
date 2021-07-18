package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" enter data type : ");
        String dataType = scan.nextLine();

        System.out.println(" enter the value of the variable : ");
        int x = scan.nextInt();

        switch (dataType) {

            case "int":
                System.out.println(x % 2);
                break;

            case "double":
                System.out.println(x * 0.7);
                break;

            case "float":
                System.out.println(Math.pow(x, 2));
                break;

            case "char":
                System.out.println((char) x);
                break;

            case "String":
                System.out.println("Hello" + x);
                break;

            default:
                System.out.println("Unsupported type");
        }
        scan.close();
    }
}