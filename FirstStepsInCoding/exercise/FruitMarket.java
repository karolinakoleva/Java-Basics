package FirstStepsInCoding.exercise;
import java.util.Scanner;
public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        double bananas = Double.parseDouble(scan.nextLine());
        double oranges = Double.parseDouble(scan.nextLine());
        double raspberries = Double.parseDouble(scan.nextLine());
        double strawberries = Double.parseDouble(scan.nextLine());
        double priceraspberries = price - (price * 0.5);
        double priceoranges = priceraspberries - (priceraspberries * 0.4);
        double pricebananas =priceraspberries - (priceraspberries*0.8);
        double amountraspberries = raspberries *priceraspberries;
        double amountbananas = bananas *pricebananas;
        double amountoranges = oranges *priceoranges;
        double amountstrawberries = strawberries *price;
        double money = amountbananas + amountoranges + amountstrawberries + amountraspberries;
        System.out.printf("%.2f",money);
    }
}
