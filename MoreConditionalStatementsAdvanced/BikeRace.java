package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors=Integer.parseInt(scanner.nextLine());
        int seniors=Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        double priceJ=0;
        double priceS=0;
        double price=0;
        double expense=0;
        double sum=0;
if(type.equals("trail")){
       priceJ=5.50*juniors;
       priceS=7*seniors;
       price=priceJ+priceS;
}
        if(type.equals("cross-country")){
            priceJ=8*juniors;
            priceS=9.5*seniors;
            price=priceJ+priceS;
            if(juniors+seniors>=50){
                price=price*0.75;
            }

        }
        if(type.equals("downhill")){
            priceJ=12.25*juniors;
            priceS=13.75*seniors;
            price=priceJ+priceS;

        }
        if(type.equals("road")){
            priceJ=20*juniors;
            priceS=21.5*seniors;
            price=priceJ+priceS;

        }
expense=price*0.05;
        sum=price-expense;
        System.out.printf("%.2f",sum);
    }
}
