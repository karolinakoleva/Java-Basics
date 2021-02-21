package WhileLoop;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int money = Integer.parseInt(scann.nextLine());
        String command = scann.nextLine();
        int countPayments = 0, cash = 0, card = 0, sum = 0, paymentsCash = 0, paymentsCard = 0, collectedSum = 0;
        while (!command.equals("End")) {
            sum = Integer.parseInt(command);
            countPayments++;
            if (countPayments % 2 == 0) {
                if (sum < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    paymentsCard++;
                    card += sum;
                    System.out.println("Product sold!");
                    collectedSum += sum;
                }
            } else {
                if (sum > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    paymentsCash++;
                    cash += sum;
                    System.out.println("Product sold!");
                    collectedSum += sum;
                }
            }

            if (collectedSum >= money) {
                break;
            }
            command = scann.nextLine();
        }
        if (collectedSum < money) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            double sumCash = cash * 1.0 / paymentsCash;
            double sumCard = card * 1.0 / paymentsCard;
            System.out.printf("Average CS: %.2f%n", sumCash);
            System.out.printf("Average CC: %.2f", sumCard);
        }

    }

}
