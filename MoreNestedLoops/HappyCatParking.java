package MoreNestedLoops;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double sum = 0;
        for (int i = 1; i <= day; i++) {
            double dailySum = 0;
            for (int j = 1; j <= hour; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    price = 2.5;
                    dailySum += price;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    price = 1.25;
                    dailySum += price;
                } else {
                    price = 1;
                    dailySum += price;
                }
            }
            sum += dailySum;
            System.out.printf("Day: %d - %.2f leva\n", i, dailySum);
        }
        System.out.printf("Total: %.2f leva", sum);
    }
}
