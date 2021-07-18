package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {

        double i = 1;

        do {
            System.out.println("степень 2 = " + i + " число возведенное = " + Math.pow(2, i++));
        } while (Math.pow(2, i) <= 1_000_000);
    }
}
