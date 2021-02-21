package ConditionalStatements;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolia=Integer.parseInt(scanner.nextLine());
        int hyacinths=Integer.parseInt(scanner.nextLine());
        int roses=Integer.parseInt(scanner.nextLine());
        int cactuses=Integer.parseInt(scanner.nextLine());
        double present=Double.parseDouble(scanner.nextLine());
        double priceMagnolia=magnolia*3.25;
        double priceHyacinths=hyacinths*4;
        double priceRoses=roses*3.5;
        double priceCactuses=cactuses*8;
        double sum=priceCactuses+priceRoses+priceHyacinths+priceMagnolia;
        double sumWithoutTax=sum-(sum*0.05);
        if (sumWithoutTax>=present){
            System.out.printf("She is left with %.0f leva.",Math.floor(sumWithoutTax-present));
        }else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(present - sumWithoutTax));
        }
    }
}
