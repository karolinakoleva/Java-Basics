package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucherPrice = Integer.parseInt(scanner.nextLine());
        int tickets = 0;
        int others = 0;
        String purchase = scanner.nextLine();
        while (!purchase.equals("End")) {
            if (purchase.length() > 8) {
                int ticketPrice = purchase.charAt(0) + purchase.charAt(1);
                if (ticketPrice <= voucherPrice) {
                    voucherPrice -= ticketPrice;
                    tickets++;
                } else {
                    break;
                }
            } else {
                int price = purchase.charAt(0);
                if (price <= voucherPrice) {
                    voucherPrice -= price;
                    others++;
                } else {
                    break;
                }
            }
                purchase = scanner.nextLine();
            }
            System.out.println(tickets);
            System.out.println(others);
        }
    }
