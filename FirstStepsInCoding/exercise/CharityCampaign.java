package FirstStepsInCoding.exercise;
import java.util.Scanner;
public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int bakers = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());
        double priceCakes = cakes * 45;
        double priceWaffles = waffles * 5.80;
        double pricePancakes = pancakes * 3.20;
        double moneyPerDay = (priceCakes + priceWaffles + pricePancakes)*bakers;
        double money = moneyPerDay*days;
        double percent = money/8;
        double charity = money - percent;
        System.out.printf("%.2f", charity);
    }
}

