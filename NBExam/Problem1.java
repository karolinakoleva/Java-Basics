package NBExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceVideoCard = Integer.parseInt(scanner.nextLine());
        int priceAdapter = Integer.parseInt(scanner.nextLine());
        double currentPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double totalPriceVideoCards = 13 * priceVideoCard;
        double totalPriceAdapters = 13 * priceAdapter;
        double totalPrice=totalPriceAdapters+totalPriceVideoCards+1000;
        double totalProfit=profitPerDay-currentPerDay;
        double profitVideoCards=13*totalProfit;
        double day=Math.ceil(totalPrice/profitVideoCards);
        System.out.printf("%.0f%n",totalPrice);
        System.out.printf("%.0f",day);
    }
}
