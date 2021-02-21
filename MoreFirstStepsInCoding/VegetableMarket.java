package FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        double kgVegatables = Double.parseDouble(scanner.nextLine());
        double kgFruits = Double.parseDouble(scanner.nextLine());
        double totalPriceV = priceVegetables * kgVegatables;
        double totalPriceF = priceFruits * kgFruits;
        double totalPrice = totalPriceF + totalPriceV;
        double priceInEuro = totalPrice / 1.94;
        System.out.printf("%.2f",priceInEuro);
    }
}
