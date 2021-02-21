package NBExam;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        double budged=Double.parseDouble(scanner.nextLine());
        int bottles=Integer.parseInt(scanner.nextLine());
        int chips=Integer.parseInt(scanner.nextLine());
        double priceBeer=bottles*1.2;
        double priceChips=priceBeer*0.45;
        double totalPriceChips=Math.ceil(priceChips*chips);
        double totalPrice=totalPriceChips+priceBeer;
        if(totalPrice<=budged){
            System.out.printf("%s bought a snack and has %.2f leva left.",name,budged-totalPrice);
        }else {
            System.out.printf("%s needs %.2f more leva!",name,totalPrice-budged);
        }
    }
}
