package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of purchases : ");
        double sum = scan.nextDouble();

        System.out.println("Enter the age of the buyer : ");
        int age = scan.nextInt();

        double sumDis;
        double dis;

        if (age > 18) {
            System.out.println("since you are over 18 your discount will be 4% more");
            dis = 0.04d;
        } else {
            System.out.println("since you are under 18 your discount will be 3% less");
            dis = -0.03d;
        }


        if (sum < 100) {
            System.out.println("amount with a 5% discount");
            sumDis = sum - sum * 0.05;

        } else if (sum >= 100 && sum < 200) {
            System.out.println("amount with a 7% discount");
            sumDis = sum - sum * 0.07;

        } else if (sum >= 200 && sum < 300) {
            System.out.println("amount with a 12% discount");
            sumDis = sum - sum * (0.12 + dis);

        } else if (sum >= 300 && sum < 400) {
            System.out.println("amount with a 15% discount");
            sumDis = sum - sum * (0.15 + dis);

        } else {
            System.out.println("amount with a 20% discount");
            sumDis = sum - sum * (0.2 + dis);
        }

        System.out.println(sumDis);
        scan.close();
    }
}