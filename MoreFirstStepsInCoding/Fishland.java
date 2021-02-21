package FirstStepsInCoding;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceMackerel=Double.parseDouble(scanner.nextLine());
        double priceSprat=Double.parseDouble(scanner.nextLine());
        double bonito=Double.parseDouble(scanner.nextLine());
        double scad=Double.parseDouble(scanner.nextLine());
        double mussels=Double.parseDouble(scanner.nextLine());
        double priceBonita=priceMackerel+priceMackerel*0.6;
        double sumBonit=bonito*priceBonita;
        double priceScad=priceSprat+priceSprat*0.8;
        double sumScad=priceScad*scad;
        double priceMussels=mussels*7.5;
        double totalPrice=sumBonit+sumScad+priceMussels;
        System.out.printf("%.2f",totalPrice);
    }
}
