package ConditionalStatements;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometer = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        if (kilometer < 20) {
            if (text.equals("day")) {
                double price = 0.7+kilometer * 0.79;
                System.out.printf("%.2f",price);
            } else if (text.equals("night")){
                double price = 0.7+kilometer * 0.9;
                System.out.printf("%.2f",price);
            }
        }
        if (kilometer >= 20&& kilometer<100) {
            double price = kilometer * 0.09;
            System.out.printf("%.2f", price);
        }
        if (kilometer >= 100) {
            double price = kilometer * 0.06;
            System.out.printf("%.2f", price);
        }
    }
}
