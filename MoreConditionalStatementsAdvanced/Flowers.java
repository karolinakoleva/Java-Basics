package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();
        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;
        double priceAll = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            priceChrysanthemums = 2 * chrysanthemums;
            priceRoses = 4.1 * roses;
            priceTulips = 2.5 * tulips;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            priceChrysanthemums = 3.75 * chrysanthemums;
            priceRoses = 4.5 * roses;
            priceTulips = 4.15 * tulips;
        }
        priceAll = priceChrysanthemums + priceRoses + priceTulips;

        if (day.equals("Y")) {
            priceAll *= 1.15;
        }
        if (season.equals("Spring") && tulips >= 7) {
            priceAll *= 0.95;
        }
        if (season.equals( "Winter")&& roses >= 10) {
            priceAll *= 0.9;
        }
        if (roses + tulips + chrysanthemums > 20) {
            priceAll *= 0.8;
        }
        System.out.printf("%.2f", priceAll + 2);
    }
}
