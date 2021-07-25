package by.academy.homework2;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {

        System.out.println("для игры в покер вам потребуется от 2 до 10 человек");
        int cardPerPlayer = 5;


        String[] cardSuit = {"Diamonds", "Hearts", "Spades", "Clubs"};
        String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int n = cardRank.length * cardSuit.length;


        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of players : ");
        int players = scan.nextInt();


        while (players < 2 || players > 10) {
            System.out.println("players limit exceeded or incorrect input");
            System.out.println("please enter the number of players  again");
            players = scan.nextInt();
        }

        System.out.println("the party will start soon");


        String[] gamingTable = new String[n];
        for (int i = 0; i < cardRank.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
                gamingTable[4 * i + j] = cardRank[i] + "-" + cardSuit[j];//умножение на 4 означает кол-во мастей
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = gamingTable[r];
            gamingTable[r] = gamingTable[i];
            gamingTable[i] = temp;
        }
        for (int i = 0; i < players * cardPerPlayer; i++) {
            System.out.println(gamingTable[i]);
            if (i % cardPerPlayer == cardPerPlayer - 1) {
                System.out.println("----------------");
            }
        }
    }
}


