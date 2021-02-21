package Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int supernumerary = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());
        double decor = budget *0.1;
        double totalPriceClothes = supernumerary*priceClothes;
                if (supernumerary>150){
            totalPriceClothes= totalPriceClothes - (totalPriceClothes*0.1);
        }
        double price = decor + totalPriceClothes;
                double money = budget-price;
                double difference = price - budget;
        if (price>budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",difference);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",money);
        }

    }
}
