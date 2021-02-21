package Exam;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customers = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int i = 1; i <= customers; i++) {
            String command = scanner.nextLine();
            double sum = 0;
            int counter = 0;
            while (!command.equals("Finish")) {
                switch (command) {
                    case "basket":
                        counter++;
                        sum += 1.5;
                        break;
                    case "wreath":
                        counter++;
                        sum += 3.8;
                        break;
                    case "chocolate bunny":
                        counter++;
                        sum += 7;
                        break;
                }
                command = scanner.nextLine();
            }
            if (counter % 2 == 0) {
                sum *= 0.8;
            }
            totalSum += sum;
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, sum);
        }
        double avgSum = totalSum / customers;
        System.out.printf("Average bill per client is: %.2f leva.%n", avgSum);
    }
}