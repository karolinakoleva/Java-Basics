package FoorLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int loads=Integer.parseInt(scanner.nextLine());
double tonsSum=0;
double price=0;
double avg=0;
double truck=0;
double train=0;
double bus=0;
        for (int i = 1; i <= loads; i++) {
            double tons = Double.parseDouble(scanner.nextLine());
            tonsSum += tons;
            if (tons <= 3) {
                price += 200 * tons;
                bus+=tons;
            } else if (tons >= 4 && tons <= 11) {
                price += 175 * tons;
                truck+=tons;
            } else {
                price += 120 * tons;
                train+=tons;
            }
        }
        avg =  price / tonsSum;
        System.out.printf("%.2f\n", avg);
        System.out.printf("%.2f%%\n", bus / tonsSum*100);
        System.out.printf("%.2f%%\n",truck/ tonsSum*100);
        System.out.printf("%.2f%%\n",train/ tonsSum*100);
    }
}
